package com.tts.validationdemo.model;

import javax.validation.constraints.*;

public class User {

    @NotEmpty
    @Pattern(regexp = "[^\\s]+", message = "Your username cannot contain spaces")
    @NotNull(message = "Name cannot be null")
    private String name;

    @Email(message = "Email should be valid")
    private String email;




    //@AssertFalse

    @AssertTrue
    private boolean isWorking;

    //@Max()
    @Min(value = 18, message = "You need to be atleast 18 years old")
    private int age;



}
