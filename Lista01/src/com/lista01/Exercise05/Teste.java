package com.lista01.Exercise05;

import java.util.Random;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		JogoAdivinhacao ja = new JogoAdivinhacao();
		
		Scanner input = new Scanner(System.in);
        
        Random gerarNumAleatorio = new Random();
        ja.sorteado = gerarNumAleatorio.nextInt(100);
        System.out.println("Número entre 0 e 99 sorteado.");
        
        do {
            System.out.println("Tentativas: " + ja.tentativas);
            
            System.out.print("Dê um chute: ");
            ja.palpite = input.nextInt();
            
            ja.tentativas++;
            
            ja.dica(ja.palpite, ja.sorteado, ja.tentativas);
            
        } while (ja.palpite != ja.sorteado);
	}
}