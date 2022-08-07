package com.springboot.dtos;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentRequestDTO {
    
    
    @NotBlank(message = "Invalid Name: Empty name")
    @NotNull(message = "Invalid Name: Name is NULL")
    @Size(min = 3, max = 15, message = "Invalid Name: Exceeds 15 characters")
    String name;


    @Min(value = 1, message = "Invalid Age: Equals to zero")
    @Max(value = 20, message = "Invalid Age: Exceeds 20 years")
    Integer age;

    @NotBlank(message = "Invalid Guardian: Empty guardian")
    @NotNull(message = "Invalid Guardian: Guardian is NULL")
    String guardian;


    @NotBlank(message = "Invalid Phone number: Empty number")
    @NotNull(message = "Invalid Phone number: Number is NULL")
    @Pattern(regexp = "^\\d{10}$", message = "Invalid phone number")
    String mobile;

}