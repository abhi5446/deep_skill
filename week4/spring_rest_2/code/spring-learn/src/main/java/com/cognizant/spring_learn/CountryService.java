package com.cognizant.spring_learn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    private static final Logger log = LoggerFactory.getLogger(CountryService.class);

    public Country getCountry(String code) {
        log.info("START: getCountry() in Service");
        ApplicationContext con = new ClassPathXmlApplicationContext("beanConfig.xml");
        List<Country> countryList = (List<Country>) con.getBean("countries");
        Country a = countryList.stream().filter(c -> c.getCode().equalsIgnoreCase(code)).findFirst().orElse(null);
        log.info("END: getCountry() in Service");
        return a;
    }
}
