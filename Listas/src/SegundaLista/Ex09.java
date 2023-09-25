package SegundaLista;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		int[] vetor = new int[5];
		
		System.out.println("Povoe o vetor de tamanho 5");
		
		for (int i = 0; i < vetor.length; i++) {
			
			System.out.println("Valor " + (i+1));
			vetor[i] = scanner.nextInt();
			
		}
		
		
		int K;
		
		System.out.println("Digite o K-ésimo maior valor a ser encontrado");
		K = scanner.nextInt();
		
		
		System.out.println("O K-ésimo maior valor é: " + Utilidades.EncontrarOKesimoMaior(vetor, K));
		
		
		scanner.close();
	}

}
