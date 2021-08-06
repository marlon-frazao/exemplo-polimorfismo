package com.marlonfrazao.calculadora;

public class Calculadora {

	private Operacao operacao;
	
	public Calculadora(Operacao operacao) {
		this.operacao = operacao;
	}
	
	public double execute(double a, double b) {
		return operacao.execute(a, b);
	}
}
