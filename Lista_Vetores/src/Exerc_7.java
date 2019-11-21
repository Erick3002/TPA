import java.util. *;
public class Exerc_7 {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		int a[], b[], i, fat = 1 ;
		final int TAM = 15;
		a = new int [TAM];	
		b = new int [TAM];
		for (i = 0; i < TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor:");
			a[i] = ler.nextInt();
			for (int k = a[i]; k > 1; k--){
				fat *= k;
			}
			b[i] = fat;
			System.out.println(b[i]+" ");
			fat = 1;
		}
	}
}
