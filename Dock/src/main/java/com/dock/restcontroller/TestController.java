package com.dock.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testController")
public class TestController 
{
	// EndPoint to display userName,
	@GetMapping("/getMsg")
	public String testEndPoint(String st)
	{
		return "Hello "+st+" welocme to the Docker,";
	}
}
