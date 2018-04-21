package com.sycho.phonebook.phonebookapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
@ComponentScan(basePackages = "com.sycho.phonebook")
@SpringBootApplication
public class PhonebookapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhonebookapiApplication.class, args);
	}
}
