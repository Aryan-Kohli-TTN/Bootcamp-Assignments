package com.assignment.SpringBasics;

import com.assignment.SpringBasics.operations.BusinessLogic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringBasicsApplication.class);
	public static void main(String[] args) {
		ApplicationContext applicationContext =SpringApplication.run(SpringBasicsApplication.class, args);
		BusinessLogic businessLogic = applicationContext.getBean(BusinessLogic.class);
		logger.info("{}",businessLogic.do_operation(13,42));
	}

}
