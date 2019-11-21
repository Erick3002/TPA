import java.util. *;
public class Exerc_11 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], i, n, cont;
		final int TAM = 10;
		a = new int [TAM];
		for (i = 0; i < TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor:");
			a[i] = ler.nextInt();
		}
		System.out.println("Insira o valor que você deseja pesquisar:");
		n = ler.nextInt();
		cont = 0;
		for (i = 0; i < TAM; i++) {
			if (a[i] == n) {
				System.out.println("O valor "+n+" pertence a "+(i)+" posição do vetor.");
			} else if (a[i] != n) {
				cont++;
			}
			if (cont == 10) {
				System.out.println("O valor "+n+" não se encontra armazenado no vetor.");
			}
		}
	}
}
