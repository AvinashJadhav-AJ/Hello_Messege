package com.BLZ.Hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		System.out.println("Hello From BridgeLabz");
		SpringApplication.run(HelloApplication.class, args);
	}

}
