package com.javaram.tech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetMessageClass {
	
	
	@GetMapping("/msg")
	public String getMsg() {
		return "Welcome to JavaRam.0000000000000000000.!!";
	}
	
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to JavaRam.1111111111111111111111.!!";
	}

}
