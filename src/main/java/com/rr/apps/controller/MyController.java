package com.rr.apps.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/")
	public String home()
	{
		return "Hello ,welcome to spring boot application";
	}
	

}
