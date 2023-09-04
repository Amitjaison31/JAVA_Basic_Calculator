package com.canddella.application.domain;

public class Cos extends UnaryOperator {

	public Cos(Object operand) {
		super();
		this.operand = operand;

	}

	@Override
	public Object perform() {
		Double operandd = (Double) operand;
		Double result = Math.cos(operandd);
		return result;
	}

	@Override
	public Object getNumberOfOperands() {
		return NUMBER_OF_OPERANDS;
	}

}
