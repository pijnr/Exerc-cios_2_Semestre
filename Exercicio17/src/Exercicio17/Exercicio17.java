// 17) Crie um algoritmo que multiplica dois números naturais, através de somas sucessivas utilizando recursividade (Ex.: 6 * 4 = 4 + 4 + 4 + 4 + 4 + 4).

package Exercicio17;

public class Exercicio17 {

    public static void main(String[] args) {
        
        System.out.println(calc(3));
        
    }
    public static int calc (int x){
        int y = 6;
       
        if (x>0){
            return y+y;
            
        }return x-1;
                
    }
}