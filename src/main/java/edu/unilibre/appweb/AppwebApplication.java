package edu.unilibre.appweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "edu.unilibre.appweb.controlador")
public class AppwebApplication {
	public static void main(String[] args) {
		SpringApplication.run(AppwebApplication.class, args);
	}

}
