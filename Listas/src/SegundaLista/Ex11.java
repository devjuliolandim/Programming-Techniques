package SegundaLista;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		
		System.out.println("Povoe o primeiro vetor");
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.print("Valor " + (i+1) + " ");
			vetorA[i] = scanner.nextInt();
		}
		
		int[] vetorB = new int[5];
		
		System.out.println("Povoe o segundo vetor");
		
		for (int i = 0; i < vetorB.length; i++) {
			
			System.out.print("Valor " + (i+1) + " ");
			vetorB[i] = scanner.nextInt();
		}
		
		
		if(Utilidades.VerificarElementosDeVetores(vetorA, vetorB) == true) {
			
			System.out.println("Os vetores são iguais");
			
		}else {
			
			System.out.println("Os vetores não são iguais");
			
		}
		
		
		
		
		
		scanner.close();
	}

}
