// 18) Crie um algoritmo que calcula juros simples utilizando recursividade.
	package Exercicio18;

	import java.util.Scanner;


	public class Exercicio18 {
		
		
	   static int m;
	    
	    public static void main(String[] args) {
	        System.out.println(juros(m));
	    }
	     static int juros (int m){
	        Scanner sc =new Scanner(System.in);
	        int t , i =3;
	        System.out.println("Digite o valor total");
	        m = sc.nextInt();
	        System.out.println("Digite o tempo");
	        t = sc.nextInt();
	        if (t ==0){
	            return m;
	        }else {return (m*i*t)/100;}
	        
	    }
	}
