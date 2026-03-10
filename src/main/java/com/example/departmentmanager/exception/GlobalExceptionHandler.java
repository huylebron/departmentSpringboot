package com.example.departmentmanager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

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

}
