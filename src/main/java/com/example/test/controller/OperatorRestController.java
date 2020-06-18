package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.common.Constants;
import com.example.test.service.OperatorService;
import com.example.test.vo.OperatorVo;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/operator")
@AllArgsConstructor
public class OperatorRestController {
	
	OperatorService operatorService;
	
	@GetMapping("/plus")
	public String plus(OperatorVo operatorVo) {
		return operatorService.operatorCalculate(Constants.Operator.PLUS.getOperator(), operatorVo);
	}
	
	@GetMapping("/minus")
	public String minus(OperatorVo operatorVo) {
		return operatorService.operatorCalculate(Constants.Operator.MINUS.getOperator(), operatorVo);
	}
	
	@GetMapping("/division")
	public String division(OperatorVo operatorVo) {
		return operatorService.operatorCalculate(Constants.Operator.DIVISION.getOperator(), operatorVo);
	}
	
	@GetMapping("/multiply")
	public String multiply(OperatorVo operatorVo) {
		return operatorService.operatorCalculate(Constants.Operator.MULTIPLY.getOperator(), operatorVo);
	}
	
	
}
