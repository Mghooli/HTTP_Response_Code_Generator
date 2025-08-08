package com.httpdog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
	    return "redirect:/index.html"; // ✅ This will go to static page
	}

}
