package com.vd.drools;

import com.vd.drools.request.ProvidentFundRequest;
import com.vd.drools.service.DroolService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DroolServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DroolServiceApplication.class, args);
	}


}
