package com.example.departmentmanager.service;

import com.example.departmentmanager.dto.EmployeeCreateDTO;
import com.example.departmentmanager.entity.Employee;

public interface IEmploygeeService {


    Employee createEmployee(EmployeeCreateDTO employeeCreateDTO ) ;
}
