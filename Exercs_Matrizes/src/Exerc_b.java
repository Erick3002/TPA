import java.util. *;
public class Exerc_b {
	public static void main (String[] args) {
		int a[][] = new int [3][3];
		int i = 0, j = 0, maElm, meElm;
		Random x = new Random();
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) { 
				a[i][j]= x.nextInt()%10;
			}
		}
		maElm = a[0][0];
		meElm = a[0][0];
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (a[i][j] > maElm) {
					maElm = a[i][j];
				}
				if (a[i][j] < maElm) {
					meElm = a[i][j];
				}
			}
		}
		for ( i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print("["+(a[i][j])+"]");
				if (j == 2) {
					System.out.print("\n");
				}
			}
		}
		for ( i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (a[i][j] == maElm) {
					System.out.println("Maior elemento = "+maElm+" na posição ["+(i+1)+"] ["+(j+1)+"]");
				}
				if (a[i][j] == meElm) {
					System.out.println("Menor elemento = "+meElm+" na posição ["+(i+1)+"] ["+(j+1)+"]");
				}
			}
		}	
	}
}
