package com.lista01.Exercise05;

public class JogoAdivinhacao {
	int palpite = 0;
	int numero; 
	int tentativas = 0;
	int sorteado;

	public void dica(int palpite, int numero, int tentativas){
		if(palpite > numero){
			System.out.println("N�mero maior que o n�mero sorteado.");
		} else {
			if(palpite < numero){
				System.out.println("N�mero menor que o n�mero sorteado.");
			} else {
				System.out.println("Parab�ns! O n�mero era " + numero
				+ ". Voc� acertou com " + tentativas + " tentativas!");
	            }
	        }
	    }
}