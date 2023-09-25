package SegundaLista;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int[] vetA = new int[5];
		
		vetA = Utilidades.PovoarVetor(vetA);
		
		System.out.println("Digite um número para ser removido");
		int num =scanner.nextInt();
		
		int[] vetB = Utilidades.remocaoDeElemento(vetA, num);
		
		
		for (int i = 0; i < vetB.length; i++) {
			System.out.print(vetB[i]);
			if(i<vetB.length - 1) {
				System.out.print(", ");
			}
		}
		
		scanner.close();
	}

}
