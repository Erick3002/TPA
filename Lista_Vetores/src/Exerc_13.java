import java.util. *;
public class Exerc_13 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], b[], i;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		for (i = 0; i < TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor de A:");
			a[i] = ler.nextInt();
			if (a[i]%2 == 0) {
				b[i] = 1;
			} else {
				b[i] = 0;
			}
		}

		System.out.println("Vetor B:");
		for (i = 0; i < TAM; i++) {
			System.out.print(b[i]+" ");
		}
	}
}