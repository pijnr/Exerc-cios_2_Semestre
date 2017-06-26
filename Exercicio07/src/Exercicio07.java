//07) Crie um algoritmo que imprime números impares de 0 até 100 em ordem crescente utilizando recursividade.

public class Exercicio07 {
	public static void main(String[] args) {

		imprimirNum(1);

	}

	static int imprimirNum(int mm) {
		System.out.println(mm);
		mm += 2;
	
		

		if (mm < 100)
			imprimirNum(mm);
		return mm;
	}
	
}
