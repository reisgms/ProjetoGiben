package br.com.giben.principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// mvn install -DskipTests - usado para escapar o teste oo iniciar o Spring Boot

@SpringBootApplication
@ComponentScan(basePackages = {
		"br.com.giben.pessoa.fisica.controller",
		"br.com.giben.index.controller"
		})
public class GibenApplication {

	public static void main(String[] args) {
		SpringApplication.run(GibenApplication.class, args);
		System.out.println("vaaaai ");
	}
}
