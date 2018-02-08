package com.service.bmi.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestBMI {

    BMIDelegate BMIDelegate = new BMIDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = BMIDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
