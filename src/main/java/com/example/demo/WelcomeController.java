package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WelcomeController {

	@RequestMapping(value="/welcome")
	public static String welcome() {
		return "index";
		
	}
}
