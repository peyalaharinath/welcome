package com.example.welcome;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Test {

	@RequestMapping("/welcome")
	@ResponseBody
	public String welcome() {
		return "welcome to new world hari and malli";
		
	}
}
