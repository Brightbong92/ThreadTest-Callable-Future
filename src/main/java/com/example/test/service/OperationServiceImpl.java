package com.example.test.service;

import org.springframework.stereotype.Service;

@Service
public class OperationServiceImpl implements OperationService{

	@Override
	public int plusOperation(int value1, int value2) {
		return value1 + value2;
	}

	@Override
	public int minusOperation(int value1, int value2) {
		return value1 - value2;
	}

	@Override
	public int divisionOperation(int value1, int value2) {
		return value1 / value2;
	}

	@Override
	public int multiplyOperation(int value1, int value2) {
		return value1 * value2;
	}

}
