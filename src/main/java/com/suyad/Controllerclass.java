package com.suyad;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controllerclass 
{
	@GetMapping("/")
	public String greeting(Model m)
	{
		m.addAttribute("msg","Good Evening");
		return "index";
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String Hi(Model m)
	{
		String msg = "Hello how are you?";
		return msg;
	}
}
