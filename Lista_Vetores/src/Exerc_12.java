import java.util. *;
public class Exerc_12 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], i, cont, j;
		final int TAM = 10;
		a = new int [TAM];
		for (i = 0; i < TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor:");
			a[i] = ler.nextInt();
		}
		j =  TAM;
		cont = 0;
		for (i = 0; i < TAM; i++) {
			if (a[i] == a[j-1]) {
				cont++;
			} 
			j--;
		}
		if (cont == 10) {
			System.out.println("Este número é um palíndromo.");
		} else if (cont != 10) {
			System.out.println("Este número não é um palíndromo.");
		}
	}
}

