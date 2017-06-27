package Exercicio25;


public class Exercicio25 {
    public static void main(String[] args) {
        System.out.println("Resultado "+ pell(3));
        
    }
    static int pell (int i){
        if (i == 0 || i ==1){
            return i;
        }return 2*pell(i-1)+pell(i-2);
    }
}