package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller				// @controller -> whitelabel error
public class WelcomeController {		// controller
	
	@GetMapping("/helloworld")
	public String welcome(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {		// Model
		System.out.println("name : " + name);
		model.addAttribute("name", name);
		//model.addAttribute("age", age);
		return "welcome.html";
	}

}


// MVC

// @RestController : returns only content not html and jsp pages.
