package com.example.ourhockey.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
public class PlayerRequest {

    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;

    @NotNull
    private Integer age;


}
