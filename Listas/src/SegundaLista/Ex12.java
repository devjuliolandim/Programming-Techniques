package SegundaLista;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int base = 0;
		System.out.print("Digite um valor para a base: ");
		base = scanner.nextInt();
		
		int expoente = 0;
		System.out.print("Digite um valor para o expoente: ");
		expoente = scanner.nextInt();
		
		System.out.println("O resultado de " + base + " elevado a " + expoente + " é igual a " + Utilidades.Potencia(base, expoente));
		
		
		
		
		
		
		scanner.close();
	}

}
