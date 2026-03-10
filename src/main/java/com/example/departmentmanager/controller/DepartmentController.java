package com.example.departmentmanager.controller;

import com.example.departmentmanager.dto.DepartmentDTO;
import com.example.departmentmanager.entity.Department;
import com.example.departmentmanager.service.IDepartmentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/departments")
@RequiredArgsConstructor

public class DepartmentController {
    private final IDepartmentService departmentService ;
    @PostMapping
    public ResponseEntity<Department> createDepartment(@Valid @RequestBody DepartmentDTO departmentDTO){
        Department saveDepartment = departmentService.createDepartment(departmentDTO) ;
        return new ResponseEntity<>(saveDepartment , HttpStatus.CREATED) ;
    }


}
