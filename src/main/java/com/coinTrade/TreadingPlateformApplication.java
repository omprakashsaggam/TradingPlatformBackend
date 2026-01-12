package com.coinTrade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class TreadingPlateformApplication {

	public static void main(String[] args) {
		SpringApplication.run(TreadingPlateformApplication.class, args);
	}

}
