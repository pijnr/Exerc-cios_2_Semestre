// 14) Crie um algoritmo que solicita faltas de 10 alunos e imprima a média aritmética utilizando recursividade.

	import java.util.Scanner;


	public class Exercicio14 {
	    public static void main(String[] args) {
	    
	    int []vet = new int[10];
	    int calc = 0;
	    
	        System.out.println(pegarFalta(vet, 0, calc)/10);
	    
	       
	    }

	    private static int pegarFalta(int [] vet, int i,int calc) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Digite a Falta ");
	            calc +=vet[i] = sc.nextInt();
	            i++;
	        
	        if (i<10){
	            return pegarFalta(vet, i, calc);
	         
	        }
	        return calc;
	       
	       
	}
}
