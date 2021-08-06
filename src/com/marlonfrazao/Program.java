package com.marlonfrazao;

import com.marlonfrazao.calculadora.Calculadora;
import com.marlonfrazao.calculadora.Divisao;
import com.marlonfrazao.calculadora.Multiplicacao;
import com.marlonfrazao.calculadora.Soma;
import com.marlonfrazao.calculadora.Subtracao;

public class Program {

	public static void main(String[] args) {
		Calculadora calculadora;

		calculadora = new Calculadora(new Soma());
		
		System.out.println("8 + 2 = " + calculadora.execute(8.0, 2.0));
		
		calculadora = new Calculadora(new Subtracao());
		
		System.out.println("8 - 2 = " + calculadora.execute(8.0, 2.0));
		
		calculadora = new Calculadora(new Multiplicacao());
		
		System.out.println("8 x 2 = " + calculadora.execute(8.0, 2.0));
		
		calculadora = new Calculadora(new Divisao());
		
		System.out.println("8 / 2 = " + calculadora.execute(8.0, 2.0));
	}

}
