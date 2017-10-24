package edu.nju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration
public class WebApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApiApplication.class, args);
	}
}
