package com.classical.guitar;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.classical.guitar")
@SpringBootApplication
public class ClassicalGuitarForumApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassicalGuitarForumApplication.class, args);
	}
}
