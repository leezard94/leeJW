package com.example.apitest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// bean 을 찾지 못하는 에러가 발생하면
// @SpringBootApplication() 괄호 안에  scanBasePackages = "com.example.apitest.Mapper" 넣어준다
//E scanBasePackages =못찾는 경로.
//scanBasePackages = "com.example.apitest.Mapper"

@SpringBootApplication()
public class ApitestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApitestApplication.class, args);
	}

}
