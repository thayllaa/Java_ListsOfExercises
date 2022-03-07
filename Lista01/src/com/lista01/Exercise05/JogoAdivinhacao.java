package com.lista01.Exercise05;

public class JogoAdivinhacao {
	int palpite = 0;
	int numero; 
	int tentativas = 0;
	int sorteado;

	public void dica(int palpite, int numero, int tentativas){
		if(palpite > numero){
			System.out.println("Número maior que o número sorteado.");
		} else {
			if(palpite < numero){
				System.out.println("Número menor que o número sorteado.");
			} else {
				System.out.println("Parabéns! O número era " + numero
				+ ". Você acertou com " + tentativas + " tentativas!");
	            }
	        }
	    }
}