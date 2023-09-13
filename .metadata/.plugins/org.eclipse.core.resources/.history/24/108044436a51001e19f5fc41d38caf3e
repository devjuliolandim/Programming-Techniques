package SegundaLista;

import java.util.Scanner;

public class Ex03 {
	
	
	public static double[] PovoarVetor(double[] a){
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print("Posição " + (1+i) + " ");
			a[i] = scanner.nextDouble();
		}
		
		
		
		return a;
	}
	
	
	

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Digite o tamanho do primeiro vetor");
		
		int tamanhoA = scanner.nextInt();
		
		double[] vetorA = new double[tamanhoA];
		
		System.out.println("Povoe o primeiro vetor");
		
		vetorA = PovoarVetor(vetorA);
		
		
		
		System.out.println("Digite o tamanho do segundo vetor");
		
		int tamanhoB = scanner.nextInt();
		
		double[] vetorB = new double[tamanhoB];
		
		System.out.println("Povoe o segundo vetor");
		
		vetorB = PovoarVetor(vetorB);
		
		
		Utilidades.mediavetores(vetorA, vetorB);
		
		
		
		
		
		scanner.close();
	}

}
