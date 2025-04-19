package com.example.controller;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class PersonDTO {

    @NotBlank
    private String name;

    @NotBlank
    private String family;

    @Min(1)
    @Max(2011)
    private int year_birth;

    @Pattern(regexp = "^([0-9]|[0-9]|[0-3])$")
    private int code;

    @Min(1991)
    @Max(2025)
    private int date;



    

}
