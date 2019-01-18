package com.kiran.contactapp.web;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kiran.contactapp.service.ContactService;

@Controller

public class TestController {
	
	String name;
	@Autowired
	Environment env;
	
	@Autowired
	ContactService testService;
	
	@RequestMapping("/test")
	public String testController(Model model) {
		model.addAttribute("test", "kiran");
		name="i am kiran";
		//testService.save();
		return "test";
	}
	
	@GetMapping("/check")
	public String check(Model model) {
		model.addAttribute("test1", name);
		return "test";
	}
}
