package com.hospital.management.system.hospital.management.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController 
{
	@GetMapping("/hospital")
	public String getInfo()
	{
		return "You Welcom To Hospital";
	}

}
