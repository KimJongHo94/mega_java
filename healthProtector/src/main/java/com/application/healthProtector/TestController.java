package com.application.healthProtector;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello, world";
	}
	
}
