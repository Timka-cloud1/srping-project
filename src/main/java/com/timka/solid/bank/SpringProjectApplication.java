package com.timka.solid.bank;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("props.xml");

	}

}
