package com.lista01.Exercise07;

public class Teste {
	public static void main(String[] args) {
		Porta p = new Porta();
		
		p.abrir();
		p.fechar();
		p.abrir();
		p.fechar();
		p.abrir();
		p.fechar();
		
		
		Porta p2 = new Porta();
		p2.abrir();
		p2.fechar();
		p2.abrir();
		p.fechar();
		p.abrir();
	}
}