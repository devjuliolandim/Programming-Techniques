package SegundaLista;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		
		System.out.print("Digite um número inteiro: ");
		num = scanner.nextInt();
		
		if(Utilidades.VerificarSeEPrimo(num) == true) {
			
			System.out.println("O número " + num + " é primo");
		
		}else {
				
			System.out.println("O número " + num + " não é primo");
			
		}
		
		scanner.close();
	}

}
