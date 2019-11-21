import java.util. *;
public class Exerc_c {
	public static void main (String[] args) {
		int a[][] = new int [3][4];
		int i, j, s;
		Random x = new Random();
		for  (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = x.nextInt()%10;
			}
		}
		for (i = 0; i < 3; i++) {
			s = 0;
			for (j = 0; j < 4; j++) {
				s += a[i][j];
				if (j == 3) {
					a[i][j] = s;
				}
			}
		}
		System.out.println("----VALORES DA MATRIZ----");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				System.out.print("["+(a[i][j])+"]");
				if (j == 3) {
					System.out.print("\n");
				}
			}
		}
	}
}
