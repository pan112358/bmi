package com.service.bmi.controller;

import org.springframework.stereotype.Component;


@Component
public class BmiDelegate {

	final static double UNDER_WEIGHT = 18.5;
	final static String UNDER_WEIGHT_MESSAGE = "under weight"; 
	
	final static double NORMAL_WEIGHT = 24.9;
	final static String NORMAL_WEIGHT_MESSAGE = "normal weight";
	
	final static double OVER_WEIGHT = 29.9;
	final static String OVER_WEIGHT_MESSAGE = "over weight";
	
	final static String OBESITY_MESSAGE = "obesity";
	
    public String helloworld(String name, String height, String weight){
    	String messageFormat =  "Hi, %s. You are %s.";
    	String bmiMessage = null;
    	
        double doubleHeight = Double.parseDouble(height);
        double doubleWeight = Double.parseDouble(weight);
        
        double bmi = doubleWeight / doubleHeight / doubleHeight * 10000;
        
        if(bmi <= UNDER_WEIGHT) {
        	bmiMessage = UNDER_WEIGHT_MESSAGE;
        }else if(bmi <= NORMAL_WEIGHT) {
        	bmiMessage = NORMAL_WEIGHT_MESSAGE;
        }else if(bmi <= OVER_WEIGHT) {
        	bmiMessage = OVER_WEIGHT_MESSAGE;
        }else {
        	bmiMessage = OBESITY_MESSAGE;
        }
        
    	
        return String.format(messageFormat, name, bmiMessage);
    }
}
