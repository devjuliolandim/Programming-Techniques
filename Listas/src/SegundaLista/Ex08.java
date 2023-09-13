package SegundaLista;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] vetor = new int[5];
		
		System.out.println("Digite valores para o seu vetor");
		
		for (int i = 0; i < vetor.length; i++) {
			
			System.out.print("Valor " + (i+1) + ": ");
			vetor[i] = scanner.nextInt();
		}
		
		
		
		if(Utilidades.VerificarOrdemCrescente(vetor)==true) {
			
			System.out.println("Seu vetor está ordenado em ordem crescente");
			
		}else {
			
			System.out.println("Seu vetor não está ordenado em ordem crescente");
		}
		
		
		
		
		
		scanner.close();
	}

}
