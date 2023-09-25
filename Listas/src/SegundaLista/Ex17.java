package SegundaLista;

import java.util.Scanner;

public class Ex17 {
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite um número");
	int a = scanner.nextInt();
	
	
	if(Utilidades.VerificarSeEPrimo(a)== true) {
		
		System.out.println("É primo!");
	}else {
		
		System.out.println("Não é primo!");
	}
	
	
}	

	

}
