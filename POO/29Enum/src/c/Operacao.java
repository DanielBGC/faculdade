/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

/**
 *
 * @author EDYA
 */
public enum Operacao {
	SOMA ("+") {
		@Override
		Integer executa(Integer a, Integer b) {
			return a + b;
		}
	},
	SUBTRACAO ("-") {
		@Override
		Integer executa(Integer a, Integer b) {
			return a - b;
		}
		
	},
	MULTIPLICACAO ("*"){
		@Override
		Integer executa(Integer a, Integer b) {
			return a * b;
		}
		
	},
	DIVISAO ("/") {
		@Override
		Integer executa(Integer a, Integer b) {
			return a / b;
		}
		
	};

	private final String sinal;
	private Operacao(String sinal) {
		this.sinal = sinal;
	}
	public String getSinal() {
		return sinal;
	}
	abstract Integer executa(Integer a, Integer b);
}
