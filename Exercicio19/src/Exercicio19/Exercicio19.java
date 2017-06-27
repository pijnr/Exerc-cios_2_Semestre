package Exercicio19;

public class Exercicio19 {
    
	
	static class Permutacoes {

	
	private static int cont=0; 
	
	
	private static char[] p;    
	
	public static void permuta(char [] vet) {
		
		p = new char[vet.length];
		permuta(vet,0);
	}
			

	private static void permuta(char []vet, int n) {
		
		if (n==vet.length) {
			cont++;
			imprime();
							
		} else {
					
			for (int i=0; i < vet.length; i++) {
			
				boolean achou = false;
			
				for (int j = 0; j < n; j++) {
				
					if (p[j]==vet[i]) achou = true;
				}
			
				if (!achou) {
					
					p[n] = vet[i];
					permuta(vet,n+1);
				}
				
			} 
			
		} 
		
	} 
	
	
	
	private static void imprime() {
		
		System.out.println();
		System.out.print("(" + cont + ") : ");
		for (int i=0; i < p.length; i++) System.out.print(p[i] + " ");
		
	} 
	

	
	public static void main(String[] args) {
		
		char v[] = {'A','B','C', 'D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		Permutacoes.permuta(v);
	}
	
        }
}



