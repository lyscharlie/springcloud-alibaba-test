package com.lyscharlie.test1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lyscharlie.test1.biz.mapper")
public class SpringbooTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbooTest1Application.class, args);
	}

}
