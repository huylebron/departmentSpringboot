package com.example.departmentmanager.service;

import com.example.departmentmanager.dto.DepartmentDTO;
import com.example.departmentmanager.entity.Department;
import com.example.departmentmanager.repository.IDepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements IDepartmentService{

    private final IDepartmentRepository iDepartmentRepository ;



    @Override
    public Department createDepartment(DepartmentDTO departmentDTO) {

        Department department = Department.builder()
                .name(departmentDTO.getName())
                .description(departmentDTO.getDescription())
                .build();

        return iDepartmentRepository.save(department) ;

    }
}
