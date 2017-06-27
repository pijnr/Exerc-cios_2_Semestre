// 20) Crie um algoritmo para calcular o fatorial de um número.

package exercicio20;

public class Exercicio20 {

	    static int x = 6;
	    public static void main(String[] args) {
	        System.out.println(fatorial(x));
	    }
	    static int fatorial(int x){
	       
	        if (x ==0){
	            return 1;
	        }else {return x*fatorial(x-1);
	        }
	    }
	}

