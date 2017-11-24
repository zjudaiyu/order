package com.huaweiair.order.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-24T05:59:57.182Z")

@RestSchema(schemaId = "order")
@RequestMapping(path = "/huaweiair/v1", produces = MediaType.APPLICATION_JSON)
public class OrderImpl {

    @Autowired
    private OrderDelegate userOrderDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userOrderDelegate.helloworld(name);
    }

}
