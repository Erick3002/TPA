import java.util. *;
public class Exerc_14 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], b[], c[], i;
		final int TAM = 5;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		for(i = 0; i < TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor de A:");
			a[i] = ler.nextInt();
			System.out.println("Entre com o "+(i+1)+"o. valor de B:");
			b[i] = ler.nextInt();
			if (a[i] > b[i]) {
				c[i] = 1;
			} else if (a[i] == b[i]) {
				c[i] = 0;
			} else {
				c[i] = -1;
			}
		}
		for(i = 0; i < TAM; i++) {
			System.out.println(c[i]+" "); 
		}
	}
}
