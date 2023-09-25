package SegundaLista;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double montante = 0;
		double capital = 0;
		double taxa = 0;
		double tempo = 0;
		
		System.out.print("Digite o valor inicial: ");
		capital = scanner.nextDouble();
		
		System.out.print("Digite a taxa: ");
		taxa = scanner.nextDouble();
		
		System.out.print("Digite o tempo: ");
		tempo = scanner.nextDouble();
		
		
		montante = capital * Math.pow(1 + taxa, tempo);
		
		System.out.println("O montante é: " + montante);
		scanner.close();
	}

}
