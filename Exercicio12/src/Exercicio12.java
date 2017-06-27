// 12) Crie um algoritmo que imprime a tabuada de um número informado pelo usuário utilizando recursividade.
import java.util.Scanner;
public class Exercicio12 {
	  
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int m;
	        int calc = 0;
	        int mm =0;
	        
	        System.out.println("Digite");
	        m = sc.nextInt();
	        
	        digi(calc, m, mm);
	    }

	    

	    public static void  digi(int calc, int m, int mm) {
	        if (calc < 10) {
	            mm =m*calc;
	            System.out.print(mm+",");
	           
	            calc ++;
	        }
	        
	        if (calc == 10){
	            mm=m*calc;
	            System.out.print(mm);
	        }
	        
	        else digi(calc, m , mm); 
	    }
	}

