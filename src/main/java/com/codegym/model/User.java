package com.codegym.model;

import javax.validation.constraints.*;

public class User {

    @NotNull
    @Size(min = 2, max = 30)
    private String name;

    @Min(18)
    @Max(99)
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}