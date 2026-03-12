package com.example.departmentmanager.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id ;
//    @Column(name = "name" , nullable = false , length = 50)
//    private String name ;
//    @Column(name = "description", length = 100)
//    private String description  ;
//
//    @OneToMany(mappedBy = "department")
//    @Builder.Default
//    @JsonIgnore
//    private List<Employee> employees = new ArrayList<>();
//


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id ;
    @Column ( name =  "name " , nullable = false , length = 50)

    private  String name ;
    @Column(name = "description" ,length = 100)
    private String description ;

    @OneToMany(mappedBy = "department")
    @Builder.Default
    @JsonIgnore
    private List<Employee> employees = new ArrayList<>() ;




}
