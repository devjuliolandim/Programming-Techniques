package SegundaLista;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {

		int tamanho = 10;

		int[] vetor = new int[tamanho];

		Random random = new Random();

		for (int i = 0; i < tamanho; i++) {

			vetor[i] = random.nextInt();

		}

		for (int i = 0; i < tamanho; i++) {

			System.out.println(vetor[i] + " ");

		}

		int soma = Utilidades.somatorio(vetor);

		System.out.println("A soma é: " + soma);

	}

}
