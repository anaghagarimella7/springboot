package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
    System.out.print("Printing");

    SpringApplication.run(DemoApplication.class, args);
	}
}
