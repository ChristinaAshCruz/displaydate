package com.christinac.displaydate.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String homepage() {
		return "homepage.jsp";
	}
	
	@RequestMapping("/date") 
		public String datePage(Model model) {
			String pattern = " E, MMM dd, yyyy";
			DateFormat dateFormat = new SimpleDateFormat(pattern);
			Date currentDate = Calendar.getInstance().getTime();
			String currentDateAsString = dateFormat.format(currentDate);
			
			model.addAttribute("currentDate", currentDateAsString);
			return "date.jsp";
	}
	
	
	@RequestMapping("/time") 
		public String timePage(Model model) {
		String pattern = "hh:mm a";
		DateFormat dateFormat = new SimpleDateFormat(pattern);
		Date currentTime = Calendar.getInstance().getTime();
		String currentTimeAsString = dateFormat.format(currentTime);
		
		model.addAttribute("currentTime", currentTimeAsString);
			return "time.jsp";
		}

	
}

