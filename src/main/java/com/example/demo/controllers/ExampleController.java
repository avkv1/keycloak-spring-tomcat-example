package com.example.demo.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class ExampleController {

    @RequestMapping(method = GET, value = "/")
    public String getHome(){
        return "Hello! You can test protected area here:  /protected/*any_page*";
    }

    @RequestMapping(method = GET, value = "/protected/**")
    public String getProtected(Principal principal){
        return "Protected area: "+principal.toString();
    }

}
