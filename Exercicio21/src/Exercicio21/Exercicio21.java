// 21) Crie um algoritmo para calcular números triangulares.

	package Exercicio21;

	import java.util.Scanner;


	public class Exercicio21 {
	    static int x;
	    public static void main(String[] args) {
	        System.out.println(tri(x));
	    }
	    static int tri(int x){
	        Scanner sc = new Scanner(System.in);
	        x=sc.nextInt();
	        if (x == 1){
	            return 1;
	        }else {return x*(x+1)/2;}
	    }
	}

