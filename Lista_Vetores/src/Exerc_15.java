import java.util. *;
public class Exerc_15 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], b[], c[], i;
		final int TAM = 5;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		for (i = 0; i < TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor de A:");
			a[i] = ler.nextInt();
			b[i] = a[i];
		}
		Arrays.sort(b);
		for (i = 0; i < TAM; i++) {
			c[i] = b[i];
		}
		System.out.println("Ordem crescente: ");
		for (i = 0; i < TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println(" ");
		System.out.println("Ordem decrescente: ");
		for (i = TAM; i > 0; i--) {
			System.out.print(c[i-1]+" ");
		}
	}
}
