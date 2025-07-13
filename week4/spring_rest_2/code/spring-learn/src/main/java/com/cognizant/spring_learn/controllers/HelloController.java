package com.cognizant.spring_learn.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.SpringLearnApplication;

@RestController
public class HelloController {
    private static final Logger log = LoggerFactory.getLogger(SpringLearnApplication.class);

    @GetMapping("/hello")
    public String hello(){
        log.info("Started request");
        log.info("ended request");
        return "Hello World";
    }
    
}
