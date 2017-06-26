import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		
		int [][][] matriz = new int [2][2][2];
		
		receberDados(matriz, 0, 0,0);
		
		imprimirReceberDados(matriz, 0, 0,1,0);
		
}
	static void imprimirReceberDados(int [][][] matriz, int i, int j, int count, int k) {
		
		System.out.println("número: " + count + "º:" + matriz[i][j][k]);
		k++;
		count++;
		
		if(k == 2){
			j++;
			k = 0;
		}

		if(j == 2){
			i++;
			j = 0;
		}
			
		if(i < 2) imprimirReceberDados(matriz,i , j, count, k);
}
	
	static void receberDados(int [][][] matriz, int i, int j,int k) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		matriz[i][j][k] = sc.nextInt();
		k++;
		
		if(k == 2){
			j++;
			k = 0;
						
		}
		
		if(j == 2){
			i++;
			j = 0;
		}	
		
		if(i < 2) receberDados(matriz,i , j, k);
		
		}
		
}
	

