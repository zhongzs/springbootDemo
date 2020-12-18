package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {
	
	@ResponseBody
	@RequestMapping("/hello")
	public String helloworld(){
		System.out.print("主干提交")
		return "hello world";
	}
	
}
