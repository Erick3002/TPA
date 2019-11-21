	import java.util.Scanner;
public class Exerc_1 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=20;
		int i, a[], b[], D;
		a = new int [TAM];
		b = new int [TAM];
		int j=0;
		for (i=0; i<20; i++){
			System.out.println("Entre com o "+(i+1)+"o. valor:");
			a[i] = ler.nextInt();	
		    }
		for (i=0; i<TAM; i++) {
			D = a[i]%2;
			if (D == 0) {
				b[j] = a[i];
				j++;
			}
		}
		for (i=0; i<TAM; i++) {
	 		 D = a[i]%2;
			if (D != 0) {
		     	b[j] = a[i];
		    	j++;
				}
		  	}
		for (i=0; i<TAM; i++){
			System.out.print(b[i]+", ");	
			}
	  }
}
