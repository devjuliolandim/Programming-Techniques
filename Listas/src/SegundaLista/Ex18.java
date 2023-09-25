package SegundaLista;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma string");
		String string = scanner.next();
		
		String reversa = Utilidades.inversaoDeString(string);
		
		System.out.println(reversa);
		
		scanner.close();
	}

}
