package com.idat.EFERICKMARQUEZCLIENTE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EfErickmarquezClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfErickmarquezClienteApplication.class, args);
	}

}
