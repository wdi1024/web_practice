package com.example.first_project.ioc;

public class Pork extends Ingredient{
    private String name;
    public Pork(String name) {
        super(name);
    }
    public String getName() {
        return name;
    }
}