package com.home.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String getContactInfo()
	{
		return "contact-info";
	}
}
