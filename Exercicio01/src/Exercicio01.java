// 01) Crie um algoritmo que imprime n�meros de 0 at� 100 em ordem crescente utilizando recursividade.
public class Exercicio01 {

	public static void main(String[] args) {

		imprimirNum(0);

	}

	static int imprimirNum(int mm) {
		System.out.println(mm);
		mm++;

		if (mm <= 100)
			imprimirNum(mm);
		return mm;
	}

}
	