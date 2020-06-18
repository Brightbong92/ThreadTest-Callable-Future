package com.example.test.common;

public class Constants {
	
	public enum Operator {
		PLUS("+"),
		MINUS("-"),
		DIVISION("/"),
		MULTIPLY("*"),
		EQUAL("=");
		
		private final String operator;
		
		Operator(String operator) {
			this.operator = operator;
		}
		
		public String getOperator() {
			return operator;
		}
	}
}
