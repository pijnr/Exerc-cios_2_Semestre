//08) Crie um algoritmo que imprime n�meros pares de 0 at� 100 em ordem decrescente utilizando recursividade.
public class Exercicio08 {
	public static void main(String[] args) {

		imprimirNum(100);

	}

	static int imprimirNum(int mm) {
		System.out.println(mm);
		mm -= 2;
		

		if (mm >= 0)
			imprimirNum(mm);
		return mm;
	}

}
