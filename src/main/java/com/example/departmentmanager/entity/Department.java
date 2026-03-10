package com.example.departmentmanager.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "departments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(name = "name" , nullable = false , length = 50)
    private String name ;
    @Column(name = "description", length = 100)
    private String description  ;


}
