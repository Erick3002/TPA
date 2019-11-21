import java.util. *;
public class Exerc_1 {
	public static void main(String[] args) {
		int a[][] = new int [5][5];
		int i, j;
		a[0][0] = 1;
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 5; j++) {
				if(i == j) {
					a[i][j] = 1;
				}
			}
		}
		System.out.println("---Valores da Matriz---");
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print("["+(a[i][j])+"]");
				if (j == 4) {
					System.out.print("\n");
				}
			}
		}
	}
}
