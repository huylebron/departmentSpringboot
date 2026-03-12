package com.example.departmentmanager.controller;

import com.example.departmentmanager.dto.EmployeeCreateDTO;
import com.example.departmentmanager.entity.Employee;
import com.example.departmentmanager.service.IEmploygeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private  final IEmploygeeService employgeeService ;
    @PostMapping
    public ResponseEntity<Employee> createEmployee(@Valid @RequestBody EmployeeCreateDTO employeeCreateDTO) {

        Employee savedEmployee = employgeeService.createEmployee(employeeCreateDTO ) ;
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED ) ;

    }
}
