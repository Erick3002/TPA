import java.util. *;
public class Exerc_10 {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		int a[], b[], c[], i, cont = 0;
		final int TAM = 5;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		for (i = 0; i < TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor de A:");
			a[i] = ler.nextInt();
		}
		for (int j = 0; j < TAM; j++) {
			System.out.println("Entre com o "+(j+1)+"o. valor B:");
			b[j] = ler.nextInt();
		}		
		for(i = 0; i < TAM; i++) {
			cont = 0;
			for (int j = 0; j < TAM; j++) {
				if (a[i] != b[j]) {
					cont++;
			    }
				if(cont==5){
					c[i] = a[i];
				}
			}	
		} 
		System.out.print("Diferença de A e B = ");
		for (i = 0; i < TAM; i++) {
			System.out.print(c[i]+" ");
		}
	}
}