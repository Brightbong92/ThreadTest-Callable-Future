package com.example.test.service;

import org.springframework.stereotype.Service;

import com.example.test.common.Constants;
import com.example.test.vo.OperatorVo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class OperatorServiceImpl implements OperatorService{

	@Override
	public String operatorCalculate(String operator, OperatorVo operatorVo) {
		return calculate(operator, operatorVo);
	}

	private String calculate(String operator, OperatorVo operatorVo) {
		int result = 0;
		switch (operator) {
		case "+" : 
			result = operatorVo.getValue1() + operatorVo.getValue2(); 
			return operatorVo.getValue1() + Constants.Operator.PLUS.getOperator() + operatorVo.getValue2() + Constants.Operator.PLUS.getOperator() + result;
		case "-" : 
			result = operatorVo.getValue1() - operatorVo.getValue2();
			return operatorVo.getValue1() + Constants.Operator.MINUS.getOperator() + operatorVo.getValue2() + Constants.Operator.EQUAL.getOperator() + result;
		case "/" : 
			result = operatorVo.getValue1() / operatorVo.getValue2();
			return operatorVo.getValue1() + Constants.Operator.DIVISION.getOperator() + operatorVo.getValue2() + Constants.Operator.EQUAL.getOperator() + result;
		case "*" : 
			result = operatorVo.getValue1() * operatorVo.getValue2();
			return operatorVo.getValue1() + Constants.Operator.MULTIPLY.getOperator() + operatorVo.getValue2() + Constants.Operator.EQUAL.getOperator() + result;
		default : 
			return "0";
		}
	}
	

}




