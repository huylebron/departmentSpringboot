package com.example.departmentmanager.exception;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String , String>> handleValidationException(MethodArgumentNotValidException exception) {
        Map<String , String > errors =  new HashMap<>();
        exception.getBindingResult().getAllErrors().forEach(error -> {
            String feldName = ((FieldError) errors).getField();
            String message = error.getDefaultMessage();
            errors.put(feldName,message) ;
        });

        return new ResponseEntity<>(errors , HttpStatus.BAD_REQUEST) ;
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Map<String , String>> handleEntityNotFound(EntityNotFoundException exception) {

        Map<String , String> error = new HashMap<>();
        error.put("message",exception.getMessage()) ;
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND) ;

    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Map<String , String>> handleIlegalArgument(IllegalArgumentException exception) {

        Map<String , String > error = new HashMap<>();
        error.put("message",exception.getMessage()) ;
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST) ;

    }


    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String , Object>> handleResourceNotFoundException( ResourceNotFoundException exception) {
        Map<String , Object> response = new HashMap<>();

        response.put("timestamp", LocalDateTime.now()) ;
        response.put("status",HttpStatus.NOT_FOUND.value()) ;
        response.put("error", "not found") ;
        response.put("message", exception.getMessage()) ;

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND) ;

    }

    @ExceptionHandler(DuplicateResourceException.class)
    public ResponseEntity<Map<String , Object>> handleDuplicateResourceException(DuplicateResourceException exception) {
        Map<String , Object> response = new HashMap<>() ;
        response.put("timestamp", LocalDateTime.now()) ;
        response.put("status",HttpStatus.NOT_FOUND.value()) ;
        response.put("error", "not found") ;
        response.put("message", exception.getMessage()) ;

        return new ResponseEntity<>(response , HttpStatus.CONFLICT) ;

    }



}
