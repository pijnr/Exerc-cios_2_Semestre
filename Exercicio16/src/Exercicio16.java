import java.util.Scanner;



public class Exercicio16 {
    public static void main(String[] args) {
        String[] n = new String[10];
        
        pg(n, 0);
        ip(n, 0);
    }
    
    static void ip (String[] n, int i ){
        System.out.println("Nome: "+n[i]);
        i++;
        
        if (i < 10){
            ip(n, i);
        }
        
    }
    static void pg (String[] n , int i ){
        Scanner entrada = new Scanner(System.in);
        
        n[i]= entrada.nextLine();
        i++;
        
        if (i < 10){
            pg(n, i);
            
        }entrada.close();
}
}