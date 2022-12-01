package com.spring.app.mensajes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.spring.app.commons.models.entity"})
public class SpringbootServicioMensajesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioMensajesApplication.class, args);
	}

}
