package com.lyscharlie.test2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lyscharlie.test2.biz.mapper")
public class SpringbooTest2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbooTest2Application.class, args);
	}

}
