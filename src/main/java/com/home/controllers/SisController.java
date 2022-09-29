package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {
	
	@ResponseBody
	@RequestMapping("/makeup")
	public String getMakeUp() {
		return "here is the Makeup";
	}
	
	@ResponseBody
	@RequestMapping("/book")
	public String getBook() {
		return "Math book";
	}

}
