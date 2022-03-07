package com.lista01.Exercise07;

public class Porta {
	boolean isOpen;
	static int numAberturas;
	
	void abrir() {
		isOpen = true;
		System.out.println("A porta se abriu.");
		numAberturas++;
		System.out.println("Números de aberturas: " + numAberturas);
	}
	
	void fechar() {
		isOpen = false;
		System.out.println("A porta se fechou.");
	}
}
