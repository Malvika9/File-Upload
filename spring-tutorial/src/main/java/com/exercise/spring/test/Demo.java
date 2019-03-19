package com.exercise.spring.test;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@Controller
public class Demo {
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return ("welcome");
	}
	
	@RequestMapping("/profile/uploadpicture/")
	@ResponseBody
	String home1() {
		
		return ("File uploaded");
	}
	public static void main(String []args) throws Exception
	{
		SpringApplication.run(Demo.class, args);
	   }
	
	
}
