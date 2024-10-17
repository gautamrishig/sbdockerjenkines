package com.javaram.tech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetMessageClass {
	
	
	@GetMapping("/msg")
	public String getMessage() {
		return "Welcome to JavaRam.0000000000000000000.!!";
	}

}
