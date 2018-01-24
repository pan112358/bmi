package com.service.bmi.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestBmi {

        BmiDelegate bmiDelegate = new BmiDelegate();


    @Test
public void testhelloworld(){
        String expactReturnValue = "Hi, Tom. You are " + BmiDelegate.NORMAL_WEIGHT_MESSAGE + ".";

        String returnValue = bmiDelegate.helloworld("Tom", "170", "70");

        assertEquals(expactReturnValue, returnValue);
    }

}
