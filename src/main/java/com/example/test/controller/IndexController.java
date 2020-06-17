package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.service.OperationService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class IndexController {
	
	@Autowired
	OperationService operationService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody String index() {
		return "Hello World";
	}
	
	@RequestMapping(value = "/plus", method = RequestMethod.GET)
	public @ResponseBody String add(@RequestParam int value1, @RequestParam int value2) {
		return value1 + " + " + value2 + " = " + operationService.plusOperation(value1, value2);
	}
	
	@RequestMapping(value = "/minus", method = RequestMethod.GET)
	public @ResponseBody String minus(@RequestParam int value1, @RequestParam int value2) {
		return value1 + " - " + value2 + " = " + operationService.minusOperation(value1, value2);
		
	}
	
	@RequestMapping(value = "/division", method = RequestMethod.GET)
	public @ResponseBody String division(@RequestParam int value1, @RequestParam int value2) {
		return value1 + " / " + value2 + " = " + operationService.divisionOperation(value1, value2);
	}
	
	@RequestMapping(value = "/multiply", method = RequestMethod.GET)
	public @ResponseBody String multiply(@RequestParam int value1, @RequestParam int value2) {
		return value1 + " * " + value2 + " = " + operationService.multiplyOperation(value1, value2);
	}
	
	
}
