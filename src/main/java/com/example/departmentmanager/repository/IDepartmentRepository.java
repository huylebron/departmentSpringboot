package com.example.departmentmanager.repository;

import com.example.departmentmanager.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartmentRepository extends JpaRepository<Department  , Long > {

}
