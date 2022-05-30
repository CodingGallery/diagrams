package com.coding.gallery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GalleryApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(GalleryApplication.class, args);
	}
	
	@GetMapping("/")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {

		String response = String.format("Hello %s", name); 

		System.out.println("[hello] response_data : [" + response + "]");

		return response;
	}

}
