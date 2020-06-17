package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.service.OperationService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("index")
public class IndexController {
	
	@Autowired
	OperationService operationService;
	
	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("hello","Hello World");
		return "hello";
	}
	
	@RequestMapping(value = "plus", method = RequestMethod.GET)
	public String plus(Model model, @RequestParam int value1, @RequestParam int value2) {
		model.addAttribute("operation", value1 + " + " + value2 + " = " + operationService.plusOperation(value1, value2));
		return "operation";
	}
	
	@RequestMapping(value = "minus", method = RequestMethod.GET)
	public String minus(Model model, @RequestParam int value1, @RequestParam int value2) {
		model.addAttribute("operation", value1 + " - " + value2 + " = " + operationService.minusOperation(value1, value2));
		return "operation";
	}
	
	@RequestMapping(value = "division", method = RequestMethod.GET)
	public String division(Model model, @RequestParam int value1, @RequestParam int value2) {
		model.addAttribute("operation", value1 + " / " + value2 + " = " + operationService.divisionOperation(value1, value2));
		return "operation"; 
	}
	
	@RequestMapping(value = "multiply", method = RequestMethod.GET)
	public String multiply(Model model, @RequestParam int value1, @RequestParam int value2) {
		model.addAttribute("operation", value1 + " * " + value2 + " = " + operationService.multiplyOperation(value1, value2));
		return "operation";
			
	}
	
}
