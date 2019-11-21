import java.util. *;
public class Exerc_a {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[][] = new int [4][4];
		int i , j, s = 1;
		a[0][0] = 2;
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
					s *= a[0][0];
					a[i][j] = s;
			}
		}
		System.out.println("--- VALORES DA MATRIZ ---");
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.print("["+(a[i][j])+"]");
				if (j == 3) {
					System.out.print("\n");
				}
			}
		}
	}
}
