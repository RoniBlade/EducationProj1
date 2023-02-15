package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
//		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//
//		System.out.println(passwordEncoder.encode("qwerty1"));
		SpringApplication.run(DemoApplication.class, args);
	}
}
