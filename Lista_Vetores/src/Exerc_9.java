import java.util. *;
public class Exerc_9 {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		int a[], b[], c[], i, dif;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		for (int j = 0; j < TAM; j++) {
			System.out.println("Entre com o "+(j+1)+"o. valor de A:");
			a[j] = ler.nextInt();
		}
		for (i = 0; i < TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor B:");
			b[i] = ler.nextInt();
		}		
		for(i = 0; i < TAM; i++) {
			for (int j = 0; j < TAM; j++) {
				if (b[i] == a[j]) {
					c[i] = b[i];
				} 
			}	
		}	
		Arrays.sort(c);
		System.out.print(" intersecção de A e B = ");
		for (i = 0; i < TAM; i++) {
			if (c[i] != 0) {
				System.out.print(c[i]+" ");
			}
		}
	}
}