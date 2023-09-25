package SegundaLista;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o tamanho para o seu vetor: ");
		int tamanho = scanner.nextInt();
		
		int[] vetor = new int[tamanho];
		
		int[] novoVetor = Utilidades.criacaoDeVetor(vetor);
		
		for (int i = 0; i < novoVetor.length; i++) {
			System.out.print(novoVetor[i] + ", " );
		}
		
		
		
		scanner.close();
	}

}