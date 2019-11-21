import java.util. *;
public class Exerc_8 {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		int a[], b[], i, j = 0, x = 0;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		for (i = 0; i < TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor:");
			a[i] = ler.nextInt();
			for (j = i; j < TAM; j++) {
				b[j] = a[i];
				b[j] += i;
			}
			j = 0;
		}
		System.out.println(b[j]);
	}
}
