package com.email_writer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.email_writer.demo") // Explicit package scan
public class EmailWriterDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmailWriterDemoApplication.class, args);
	}
}
