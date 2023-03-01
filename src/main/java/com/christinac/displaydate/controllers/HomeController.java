package com.christinac.displaydate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String homepage() {
		return "homepage.jsp";
	}
	
	@RequestMapping("/date") 
		public String datePage(Model model) {
			Date date = new Date();
			
			model.addAttribute("currentDate", date);
			return "date.jsp";
	}
	
	
	@RequestMapping("/time") 
		public String timePage() {
			return "time.jsp";
		}

	
}

