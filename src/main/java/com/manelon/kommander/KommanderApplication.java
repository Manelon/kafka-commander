package com.manelon.kommander;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.manelon.kommander.configuration.KommanderConfig;
import com.manelon.kommander.services.ClusterService;

@SpringBootApplication
public class KommanderApplication {

	public static void main(String[] args) {
		SpringApplication.run(KommanderApplication.class, args);
	}


}
