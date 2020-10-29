package com.home.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AboutController {
  @RequestMapping("/about")
  public String aboutInfo()
  {
	  return "about-info";
  }
}
