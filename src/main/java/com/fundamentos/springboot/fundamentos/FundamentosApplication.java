package com.fundamentos.springboot.fundamentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication {

	public static void main(String[] args) {
		//El metodo main es el encargado de inicializar toda la arquitecura y la autoconfiguracion del project de springBoot
		SpringApplication.run(FundamentosApplication.class, args);
	}

}
