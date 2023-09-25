package SegundaLista;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Digite um nome: ");
		String nome = scanner.next();
		
		if(Utilidades.palindromo(nome) == true) {
			
			System.out.println("É palíndromo!");
			
		}else {
			
			System.out.println("Não é palíndromo!");
		}
		
		scanner.close();
	}

}
