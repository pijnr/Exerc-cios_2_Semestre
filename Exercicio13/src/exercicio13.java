//13) Crie um algoritmo que solicita notas de 10 alunos e imprima a média aritmética utilizando recursividade.

import java.util.Scanner;
public class exercicio13 {
	public static void main(String[] args) {
	    
	    float []vet = new float[10];
	    int calc = 0;
	    
	        System.out.println(pegarNotas(vet, 0, calc)/10);
	    
	       
	    }

	    private static int pegarNotas(float [] vet, int i,int calc) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Digite a nota ");
	            calc +=vet[i] = sc.nextInt();
	            i++;
	        
	        if (i<10){
	            return pegarNotas(vet, i, calc);
	         
	        }
	        return calc;
	       
	       
	    }

	    
	}
