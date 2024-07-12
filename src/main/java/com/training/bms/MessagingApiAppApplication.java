package com.training.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class MessagingApiAppApplication {

	public static String printmessage() {
		return "Hi oracle";}
	
	public static void main(String[] args) {
		SpringApplication.run(MessagingApiAppApplication.class, args);
		printmessage();
		System.out.println("new chenge");
	}
	@GetMapping("hey")
	public String output() {
		System.out.println("Goodbye!");
		return "Saturday and Sunday";
	}
	

}
