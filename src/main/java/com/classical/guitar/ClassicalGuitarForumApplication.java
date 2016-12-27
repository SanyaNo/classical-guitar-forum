package com.classical.guitar;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackageClasses = AppConfig.class)
@SpringBootApplication
@EnableJpaRepositories("www.classical.guitar.domain")
@EnableAutoConfiguration
@EntityScan("www.classical.guitar.domain")
public class ClassicalGuitarForumApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassicalGuitarForumApplication.class, args);
	}
}
