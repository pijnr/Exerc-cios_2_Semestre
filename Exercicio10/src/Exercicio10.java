//10) Crie um algoritmo que salva 25 números em uma matriz bidimensional utilizando recursividade.

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
	
		int [][] matriz = new int [5][5];
		
		receberDados(matriz, 0, 0);
		
		imprimirReceberDados(matriz, 0, 0,1);
		
}
	static void imprimirReceberDados(int [][] matriz, int i, int j, int count) {
		
		System.out.println("número: " + count + "º:" + matriz[i][j]);
		j++;
		count++;
		
		if(j == 5){
			i++;
			j = 0;
		}
			
		if(i < 5) imprimirReceberDados(matriz,i , j, count);
}
	
	static void receberDados(int [][] matriz, int i, int j) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		matriz[i][j] = sc.nextInt();
		j++;
		
		if(j == 4){
			i++;
			j = 0;
		}
			
		if(i < 5) receberDados(matriz,i , j);
		
		}
		
}
	

