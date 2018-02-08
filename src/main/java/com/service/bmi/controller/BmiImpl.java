package com.service.bmi.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-02-08T02:51:17.557Z")

@RestSchema(schemaId = "bmi")
@RequestMapping(path = "/bmi", produces = MediaType.APPLICATION_JSON)
public class BmiImpl {

    @Autowired
    private BmiDelegate userBmiDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userBmiDelegate.helloworld(name);
    }

}
