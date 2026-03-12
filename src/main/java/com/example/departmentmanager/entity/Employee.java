package com.example.departmentmanager.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(name = "full_name" , nullable = false , length = 100)
    private String fullName ;
    @Column (name = "email" , nullable = false , length = 100 )
    private String email ;
    @Column(name = "phone", nullable = false, unique = true, length = 10)
    private String phone;
    @Column(name = "salary" , nullable = false , precision = 15 , scale = 2)
    private BigDecimal salary ;
    @Column(name = "avatar_url")
    private String avatarUrl;

    @ManyToOne(fetch = FetchType.LAZY , optional = false)
    @JoinColumn(name = "department_id" , nullable = false)
    private Department department ;



}
