//06) Crie um algoritmo que imprime números pares de 0 até 100 em ordem crescente utilizando recursividade.

public class exercicio06 {
	public static void main(String[] args) {

		imprimirNum(0);

	}

	static int imprimirNum(int mm) {
		System.out.println(mm);
		mm += 2;
		

		if (mm <= 100)
			imprimirNum(mm);
		return mm;
	}

}


