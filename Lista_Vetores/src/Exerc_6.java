import java.util. *;
public class Exerc_6 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 11;
		int a[], i, X = 2;
		a = new int [TAM];
		for (i=0; i<TAM; i++) {
		    for (int k=0; k<i; k++) {
				X *= 2;
			}
			a[i] = X;
			X = 2;
			System.out.print(a[i]+" ");
		}
	}
}
