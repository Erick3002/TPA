import java.util. *;
public class Exerc_Exemplo {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int a [] [] = new int [3] [3];
		int i , j;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("\nEntra valor ["+(i+1)+"] ["+(j+1)+"] :: ");
				a[i][j] = ler.nextInt();
			}
		}
		System.out.println("\n:: VALORES DA MATRIZ ::\n\n");
		for (i = 0; i < 3; i++){
			for (j = 0; j < 3; j++) {
				System.out.print(" ["+a[i][j]+"] ");
				if (j == 2) {
					System.out.print("\n");
				}
			}
		}
	}
}
