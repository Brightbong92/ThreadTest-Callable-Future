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
	public @ResponseBody int add(@RequestParam int value1, @RequestParam int value2) {
		return operationService.plusOperation(value1, value2);
	}
	
	@RequestMapping(value = "/minus", method = RequestMethod.GET)
	public @ResponseBody int minus(@RequestParam int value1, @RequestParam int value2) {
		return operationService.minusOperation(value1, value2);
		
	}
	
	@RequestMapping(value = "/division", method = RequestMethod.GET)
	public @ResponseBody int division(@RequestParam int value1, @RequestParam int value2) {
		return operationService.divisionOperation(value1, value2);
	}
	
	@RequestMapping(value = "/multiply", method = RequestMethod.GET)
	public @ResponseBody int multiply(@RequestParam int value1, @RequestParam int value2) {
		return operationService.multiplyOperation(value1, value2);
	}
	
	
}
