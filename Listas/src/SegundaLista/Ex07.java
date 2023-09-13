package SegundaLista;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		int[] Vetor = new int[5];
		
		System.out.println("Digite valores para o seu vetor");
		for (int i = 0; i < Vetor.length; i++) {
		
			Vetor[i] = scanner.nextInt();
			
		}
	
	
		int[] VetorOrganizado = Utilidades.OrdenarVetor(Vetor);
	
		System.out.println("Seu vetor organizado é:");
		
		for (int i = 0; i < VetorOrganizado.length; i++) {
			System.out.print(VetorOrganizado[i] + " ");
		}
	
		scanner.close();
	}

}
