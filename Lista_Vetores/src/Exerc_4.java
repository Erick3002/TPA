import java.util. *;
public class Exerc_4 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], i, pares;
		final int TAM = 10;
		a = new int [TAM];
		for (i = 0; i < TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor");
			a[i] = ler.nextInt();
			for (int k = 1; k < a[i]; k++) {
				pares = k%2;
				if (pares == 0) {
					System.out.println(k);
				}
			}
		}
	}
}
