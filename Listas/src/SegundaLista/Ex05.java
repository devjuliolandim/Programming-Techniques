package SegundaLista;

import java.util.Scanner;

public class Ex05 {

	
public static int[] PovoarVetor(int[] a){
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print("Posição " + (1+i) + " ");
			a[i] = scanner.nextInt();
		}
		
		
		
		return a;
	}
	
	
	
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		
		System.out.println("Digite valores para o primeiro vetor");
		vetorA = PovoarVetor(vetorA);
		
		int[] vetorB = new int[5];
		
		System.out.println("Digite valores para o outro vetor");
		vetorB = PovoarVetor(vetorB);
		
		
		int num;
		
		System.out.print("Digite um número para ser encontrado nos vetores: ");
		num = scanner.nextInt();
		
		
		
		System.out.println("A quantidade de vezes que o número "+ num +" aparece nos vetores é " + Utilidades.ContarQuantasVezes(vetorA, vetorB, num));
		
		
		scanner.close();
	}

}
