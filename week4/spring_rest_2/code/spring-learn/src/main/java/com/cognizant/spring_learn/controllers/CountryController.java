package com.cognizant.spring_learn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.Country;
import com.cognizant.spring_learn.CountryService;
@RestController
public class CountryController{
    
    ApplicationContext context = new ClassPathXmlApplicationContext("beanConfig.xml");

    @Autowired
    private CountryService countryService;

    @GetMapping("/country")
    public Country getCountryIndia(){
        Country country = context.getBean("country3", Country.class);
        return country;
    }

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        Country country = countryService.getCountry(code);
        return country;
    }
}
