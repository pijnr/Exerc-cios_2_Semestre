
//04) Crie um algoritmo que retorne e imprima o menor valor de um Array (Vetor) de 10 valores inteiros informados pelo usuário utilizando recursividade.

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		int[] vetor = new int[10];

		receberNum(vetor, 0);

		int menValor = vetor[9];

		System.out.println("O menor valor é: " + receberMenorValor(vetor, 0, menValor));

	}

	private static int receberMenorValor(int[] vetor, int i, int menValor) {

		if (vetor[i] < menValor) menValor = vetor[i];
		i++;

		if (i > 9) 	return menValor;
		
		return receberMenorValor(vetor, i, menValor);

	}

	static void receberNum(int[] vetor, int i) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os números do vetor: " + (i + 1));
		vetor[i] = sc.nextInt();
		i++;

		if (i < 10)	receberNum(vetor, i);

	}

}