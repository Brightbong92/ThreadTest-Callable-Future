package com.example.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class IndexRestController {
	
	@RequestMapping("/")
	public String hello() {
		return "Hello World";
	}
	
}
