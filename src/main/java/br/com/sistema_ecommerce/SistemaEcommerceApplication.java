package br.com.sistema_ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.sistema_ecommerce")
public class SistemaEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaEcommerceApplication.class, args);
	}

}
