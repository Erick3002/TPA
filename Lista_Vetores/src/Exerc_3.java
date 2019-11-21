import java.util.Scanner;
public class Exerc_3 {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAM=10;
		int a[], i, cont = 0;
		a = new int [10];
		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor:");
			a[i] = ler.nextInt();
			for (int u = 1; u <= a[i]; u++) {
				if (a[i] % u == 0) {
					cont++;
				}
			} 
			if(cont == 1) {
				System.out.println("Não é primo nem composto.");
			} else if (cont == 2 ) {
				System.out.println(a[i]+" é primo.");
			} else {
				System.out.println(a[i]+" não é primo.");
			}
			cont = 0;
		}
	}
}