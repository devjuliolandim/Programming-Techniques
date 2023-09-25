package SegundaLista;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Digite um número: ");
		int num = scanner.nextInt();
		
		if(Utilidades.verificarNumeroPerfeito(num)==true) {
			
			
			System.out.println("É um número perfeito!");
		}else {
			
			
			System.out.println("Não é um número perfeito!");
		}
		
		
		scanner.close();
	}

}
