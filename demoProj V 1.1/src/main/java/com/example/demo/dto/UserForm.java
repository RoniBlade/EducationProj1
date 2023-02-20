package com.example.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserForm {

    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private Integer age = 0;
    private String password;



}
