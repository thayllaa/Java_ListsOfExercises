package com.lista01.Exercise01;


public class Teste {
	public static void main(String[] args) {
		Pessoa a = new Pessoa("Otávio", "Masculino", 11, false);
		Pessoa b = new Pessoa("Thaylla", "Femninino", 20, false);
		Pessoa c = new Pessoa("Francisca", "Feminino", 52, false);
		Pessoa d = new Pessoa("Paul", "Masculino", 19, true);
		Pessoa e = new Pessoa("Theo", "Masculino", 3, false);
		
		Churrasco dom = new Churrasco();
		dom.verificarConsumo(a);
		dom.verificarConsumo(b);
		dom.verificarConsumo(c);
		dom.verificarConsumo(d);
		dom.verificarConsumo(e);
	}
}