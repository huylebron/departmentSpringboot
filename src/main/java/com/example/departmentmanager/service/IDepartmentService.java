package com.example.departmentmanager.service;

import com.example.departmentmanager.dto.DepartmentDTO;
import com.example.departmentmanager.entity.Department;

public interface IDepartmentService {

    Department createDepartment(DepartmentDTO departmentDTO) ;
}
