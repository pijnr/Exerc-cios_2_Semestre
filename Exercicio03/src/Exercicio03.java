
//03) Crie um algoritmo que imprime a soma dos valores de um Array (Vetor) com 10 valores inteiros informados pelo usuário utilizando recursividade.
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int[] numVetor = new int[10];
		
		int resultado = receberNum(numVetor, 0, 0);
		System.out.println(" A soma dos valores é : " + resultado);

	}

	static int receberNum(int[] numVetor, int i, int soma) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os números: ");
		numVetor[i] = sc.nextInt();
		
		soma += numVetor[i];
		i++;
		
		if (i < 10)
			return receberNum(numVetor, i, soma);

		return soma;
	}
}