package com.example.departmentmanager.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DepartmentDTO {
    @NotBlank(message = "ten phogn ban not null")
    @Size(min = 5 , max = 50 , message = "ten phong ban phai tu 5 den 50 ki tu")
    private String name ;
    @Size(max = 100, message = "Mô tả không được vượt quá 100 ký tự")
    private String description;


}
