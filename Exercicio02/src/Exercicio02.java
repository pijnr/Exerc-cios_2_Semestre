//02) Crie um algoritmo que imprime números de 0 até 100 em ordem decrescente utilizando recursividade.
public class Exercicio02 {

	public static void main(String[] args) {

		imprimeNum(100);

	}

	static void imprimeNum(int resultado) {
		
		System.out.println(resultado);
		resultado--;

		if (resultado >= 0)
			imprimeNum(resultado);
	}
}
