package com.service.bmi.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-01-25T05:37:20.118Z")

@RestSchema(schemaId = "bmi")
@RequestMapping(path = "/bmi", produces = MediaType.APPLICATION_JSON)
public class BmiImpl {

    @Autowired
    private BmiDelegate bmiDelegate;


    public String helloworld(String name, String height, String weight) {

        return bmiDelegate.helloworld(name, height, weight);
    }

}
