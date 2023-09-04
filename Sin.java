package com.canddella.application.domain;

public class Sin extends UnaryOperator {


	public Sin(Object operand) {
		super();
		this.operand = operand;

	}

	@Override
	public Object perform() {
		Double operandd = (Double) operand;
		Double result = Math.sin(operandd);
		return result;
	}

	@Override
	public Object getNumberOfOperands() {
		return NUMBER_OF_OPERANDS;
	}

}
