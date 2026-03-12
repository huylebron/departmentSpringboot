package com.example.departmentmanager.repository;

import com.example.departmentmanager.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee , Long> {


    boolean existsByEmail(String email ) ;
    boolean existsByPhone ( String phone) ;

}
