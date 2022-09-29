package com.home.mycafe.controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeControllers {

	@RequestMapping("/cafe")
	public String showWelcomePage() {

		return "welcome-page";
	}
	
	
	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest request,Model model ) {
		
		String userInput = request.getParameter("foodType");
		model.addAttribute("userInput",userInput);
		return "process-order";
	}
}
