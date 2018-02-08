package com.service.bmi.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestBmi {

        BmiDelegate bmiDelegate = new BmiDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = bmiDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}