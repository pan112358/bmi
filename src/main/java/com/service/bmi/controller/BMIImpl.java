package com.service.bmi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2018-02-08T02:33:51.558Z")

@RpcSchema(schemaId = "BMI")
public class BMIImpl implements BMI{

    @Autowired
    private BMIDelegate BMIDelegate;


    public String helloworld(String name) {

        return BMIDelegate.helloworld(name);
    }

}
