package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {
	private static final Logger log = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void displayCountry() {	
		ApplicationContext con = new ClassPathXmlApplicationContext("beanConfig.xml");		
		Country country1 = con.getBean("country1", Country.class);	
		Country country2 = con.getBean("country2", Country.class);	
		Country country3 = con.getBean("country3", Country.class);	
		log.info("Country : {}", country1.toString());	
		log.info("Country : {}", country2.toString());	
		log.info("Country : {}", country3.toString());	
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		log.info("List of countries :");
		displayCountry();
	}

}
