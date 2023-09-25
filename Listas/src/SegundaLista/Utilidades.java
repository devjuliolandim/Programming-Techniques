package SegundaLista;

import java.util.Iterator;
import java.util.Scanner;

public class Utilidades {

	public static int[] PovoarVetor(int[] vetor) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		for (int i = 0; i < vetor.length; i++) {
			
			System.out.println("Valor " + (i+1));
			vetor[i] = scanner.nextInt();
			
		}
		
		
		
		return vetor;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int somatorio(int[] array) {

		int soma = 0;

		for (int i = 0; i < array.length; i++) {

			soma += array[i];

		}

		return soma;

	}

	public static void numererarpares(int a, int b) {

		for (int i = a; i <= b; i++) {

			if (i % 2 == 0) {

				System.out.print(i + " ");

			}

		}

	}

	public static void mediavetores(double[] vetA, double[] vetB) {

		double soma1 = 0;
		double soma2 = 0;

		for (int i = 0; i < vetA.length; i++) {
			soma1 += vetA[i];
		}

		double media1 = soma1 / vetA.length;

		System.out.println("A média do vetor A é: " + media1);

		for (int i = 0; i < vetB.length; i++) {
			soma2 += vetB[i];
		}

		double media2 = soma2 / vetB.length;

		System.out.println("A média do vetor B é: " + media2);

	}

	public static double mediaponderada(double[] notas, int[] pesos) {

		double soma = 0;

		int somaPeso = 0;

		for (int i = 0; i < 3; i++) {

			soma += (notas[i] * pesos[i]);

			somaPeso += pesos[i];

		}

		double media = soma / somaPeso;

		return media;
	}

	public static int ContarQuantasVezes(int[] A, int[] B, int num) {

		int Quantidade = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] == num) {

				Quantidade++;
			}
		}

		for (int i = 0; i < B.length; i++) {
			if (B[i] == num) {

				Quantidade++;
			}
		}

		return Quantidade;
	}

	public static int[] CopiarVetor(int[] vetor) {

		int[] Copia = new int[vetor.length];

		for (int i = 0; i < Copia.length; i++) {
			Copia[i] = vetor[i];

		}

		return Copia;
	}

	public static int[] OrdenarVetor(int[] vetor) {

		int n = vetor.length;
		int[] VetorOrdenado = new int[n];

		System.arraycopy(vetor, 0, VetorOrdenado, 0, n);

		boolean trocou;

		do {

			trocou = false;
			for (int i = 0; i < (n - 1); i++) {

				if (VetorOrdenado[i] > VetorOrdenado[i + 1]) {

					int temp = VetorOrdenado[i];
					VetorOrdenado[i] = VetorOrdenado[i + 1];
					VetorOrdenado[i + 1] = temp;
					trocou = true;

				}

			}

			return VetorOrdenado;
		} while (trocou);
	}

	public static boolean VerificarOrdemCrescente(int[] vetor) {

		int flag = 0;
		int i = 0;

		while (flag == 0 && i < vetor.length) {

			if (vetor[i] < vetor[(i + 1)]) {

				flag = 0;

			} else {

				flag = 1;
			}

		}

		if (flag == 0) {

			return true;
		} else {

			return false;
		}

	}

	public static int EncontrarOKesimoMaior(int[] vetor, int K) {

		// vetor de 5 espaços
		// k = 1
		int maior = 0;
		int menor = 0;

		for (int i = 0; i < vetor.length; i++) {

		}

		return K;
	}

	public static int EncontrarOKesimoMenor(int[] vetor, int K) {

		return K;
	}

	public static boolean VerificarElementosDeVetores(int[] vetorA, int[] vetorB) {

		int flag = 0;

		for (int i = 0; i < vetorB.length; i++) {

			if (vetorA[i] == vetorB[i]) {
				flag++;
			}

		}

		if (flag == 5) {

			return true;
		} else

			return false;
	}

	public static int Potencia(int base, int expoente) {

		if (expoente == 0) {

			return 1;
		}

		int resultado = 1;

		for (int i = 1; i <= expoente; i++) {

			resultado *= base;

		}

		return resultado;
	}

	public static boolean VerificarSeEPrimo(int num) {

		int primo = 0;

		if (num == 1) {

			return true;
		}

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {

				primo++;
			}

		}

		if (primo == 2) {

			return true;

		} else

			return false;
	}
	
	
	public static int[] BuscarPorOcorrencias(int[] vetA, int vetB[]) {
		
		int[] vetC = new int[5];
		
		int ocorrencias = 0;
		
		
		// Vet A = {1, 4, 6, 2, 5}
		// Vet B = {1, 1, 4, 5, 6}
		
		for (int i = 0; i < vetA.length; i++) {
			for (int j = 0; j < vetB.length; j++) {
				if(vetA[i] == vetB[j]) {
					
					
					
					ocorrencias++;
				}
				
				
			}
		}
		
		
		return vetC;
	}
	
	
	
	public static int[] remocaoDeElemento(int[] vetA, int num) {
		
		int size = 0;
		
		
		for (int i = 0; i < vetA.length; i++) {
			if(vetA[i] != num) {
				size++;
			}
		}
		
		
		int[] vetB = new int[size];
		int j = 0;
		
		for (int i = 0; i < vetA.length; i++) {
			if(vetA[i] != num) {
				vetB[j] = vetA[i];
				j++;
			}
		}
		
		
		return vetB;
	}
	
	
	public static boolean palindromo(String nome) {
		
		nome = nome.replaceAll("\\s", "").toLowerCase();
		
		int esquerda = 0;
		int direita = nome.length() - 1;
		
		while(esquerda < direita){
			
			
			if(nome.charAt(esquerda) != nome.charAt(direita)){
				return false;
			}
			
			esquerda++;
			direita--;
			
		}	
		return true;
	}
	
	public static String inversaoDeString(String nome) {
		
		char[] caracteres = nome.toCharArray();
		int esquerda = 0;
		int direita = caracteres.length - 1;
		
		while(esquerda < direita) {
			
			char temp = caracteres[esquerda];
			caracteres[esquerda] = caracteres[direita];
			caracteres[direita] = temp;
		
			
			esquerda++;
			direita--;
			
			
			
		}
		
		
		return new String(caracteres);
	}
	

	
	public static boolean verificarNumeroPerfeito(int num) {
		
		//6 pois = 1 + 2 + 3 = 6
		
		int soma = 0;
		
		
		for (int i = 1; i <= num/2; i++) {
			
			if(num%i==0) {
				
				soma += i;
			}
		}
		
		
		return soma == num;
		

	}
	
	public static int[] criacaoDeVetor(int[] vet) {
		
		int[] novoVetor = new int[vet.length];
		
		for (int i = novoVetor.length; i > 0; i--) {
			
			novoVetor[i - 1] = i;
			
		}
		
		
		
		
		return novoVetor;
	}
	
	
	
}
