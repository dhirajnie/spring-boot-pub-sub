package com.event.event_based_arch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventBasedArchApplication {


	OrderService orderService;
	public static void main(String[] args) {
		SpringApplication.run(EventBasedArchApplication.class, args);

	}

}
