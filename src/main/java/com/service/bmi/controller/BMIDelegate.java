package com.service.bmi.controller;

import org.springframework.stereotype.Component;


@Component
public class BMIDelegate implements BMI {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
