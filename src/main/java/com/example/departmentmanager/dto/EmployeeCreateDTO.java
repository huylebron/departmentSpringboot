package com.example.departmentmanager.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeCreateDTO {

    @NotBlank(message = "{employee.fullName.notBlank}")
    @Size(min = 5, max = 100, message = "{employee.fullName.size}")
    private String fullName;

    @NotBlank(message = "{employee.email.notBlank}")
    @Email(message = "{employee.email.invalid}")
    private String email;

    @NotBlank(message = "{employee.phone.notBlank}")
    @Pattern(
            regexp = "^(03|05|07|08|09)[0-9]{8}$",
            message = "{employee.phone.invalid}"
    )
    private String phone;

    @NotNull(message = "{employee.salary.notNull}")
    @Min(value = 5000000, message = "{employee.salary.min}")
    private Long salary;

    @NotNull(message = "{employee.departmentId.notNull}")
    private Long departmentId;
}
