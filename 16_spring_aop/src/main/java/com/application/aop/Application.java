package com.application.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy // Proxy : 대변인, 대변자
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
