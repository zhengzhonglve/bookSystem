package com.zheng.book.booksystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/hello.do")
	@ResponseBody
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("/index.do")
	public String index() {
		return "index";
	}
}
