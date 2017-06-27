package Exercicio22;



public class Exercicio22 {
   
    public static void main(String[] args) {
        System.out.println(f(2));
    }
    static int f(int x){
        if (x == 0){
            return 0;
        }return x+(f(x-1));
    }
}