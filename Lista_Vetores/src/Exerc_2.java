import java.util.Scanner;
public class Exerc_2 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=5;
		int a[], i, tab;
		a = new int[TAM];
		for (i = 0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor:");
			a[i] = ler.nextInt();
			for (int k=1; k<=10; k++) {
				tab = a[i]*k;
				System.out.println(a[i]+" X "+k+" = "+tab);
			}
		}
	}
}
