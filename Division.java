package com.canddella.application.domain;

public class Division extends BinaryOperator {

	public Division(Object operand1, Object operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	@Override
	public Object perform() {
		int operandd1 = (int) operand1;
		int operandd2 = (int) operand2;
		int result = operandd1 / operandd2;
		return result;
	}

	@Override
	public Object getNumberOfOperands() {
		return NUMBER_OF_OPERANDS;
	}

}
