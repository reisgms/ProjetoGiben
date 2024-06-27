package br.com.giben.principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// mvn install -DskipTests

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.giben.pessoa.controller"})
public class GibenApplication {

	public static void main(String[] args) {
		SpringApplication.run(GibenApplication.class, args);
	}
}
