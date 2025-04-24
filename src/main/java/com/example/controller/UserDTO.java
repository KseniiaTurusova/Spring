package com.example.controller;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class UserDTO {

    @NotNull
    private Long Inn;
    @Pattern(regexp = "^([0-9]{10})$");
   

    



    

}
