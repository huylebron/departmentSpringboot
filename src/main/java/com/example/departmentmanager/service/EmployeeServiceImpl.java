package com.example.departmentmanager.service;

import com.example.departmentmanager.dto.EmployeeCreateDTO;
import com.example.departmentmanager.entity.Department;
import com.example.departmentmanager.entity.Employee;
import com.example.departmentmanager.repository.EmployeeRepository;
import com.example.departmentmanager.repository.IDepartmentRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements IEmploygeeService{


    private final EmployeeRepository employeeRepository ;
    private final IDepartmentRepository departmentRepository ;
    @Override
    public Employee createEmployee(EmployeeCreateDTO employeeCreateDTO) {
        Department department = departmentRepository.findById(employeeCreateDTO.getDepartmentId())
                .orElseThrow(() -> new EntityNotFoundException("khnog tim thay phong ban vowis id = " + employeeCreateDTO.getDepartmentId())) ;

        if (employeeRepository.existsByPhone(employeeCreateDTO.getPhone())) {
            throw new IllegalArgumentException("sdt da ton tai ") ;

        }

//        Employee employee = Employee.builder()
//                .fullName(employeeCreateDTO.getFullName())
//                .email(employeeCreateDTO.getEmail())
//                .phone(employeeCreateDTO.getPhone())
//                .salary(BigDecimal.valueOf(employeeCreateDTO.getSalary()))
//                .department(department)
//                .build();
//
//        return employeeRepository.save(employee) ;

        Employee employee = Employee.builder()
                .fullName(employeeCreateDTO.getFullName())
                .email(employeeCreateDTO.getEmail())
                .phone(employeeCreateDTO.getPhone())
                .salary(BigDecimal.valueOf(employeeCreateDTO.getSalary()))
                .department(department)
                .build();
        return  employeeRepository.save(employee) ;

    }
}
