package SegundaLista;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int PrimeiroNumero;

		System.out.print("Digite um número inicial: ");
		PrimeiroNumero = scanner.nextInt();

		int SegundoNumero;

		do {
			System.out.print("Digite outro número: ");
			SegundoNumero = scanner.nextInt();
		
			if(SegundoNumero<= PrimeiroNumero) {
				
				System.out.println("O segundo número não poder ser menor ou igual ao primeiro");
				
			}
		
		} while (SegundoNumero <= PrimeiroNumero);

		Utilidades.numererarpares(PrimeiroNumero, SegundoNumero);
		
		
		scanner.close();
	}

}
