package com.suyad;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/welcome")
public class NewController 
{
	@GetMapping("/hello")
	@ResponseBody
	public String Hi(Model m)
	{
		String msg = "Hello how are you? from New Controller";
		return msg;
	}
}
