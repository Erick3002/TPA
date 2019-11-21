import java.util. *;
public class Exerc_3 {
	public static void main(String[] args) {
		int n;
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira um número de tábuada desejada:");
		n = ler.nextInt();
		tabuada(n);
	}
	public static int tabuada (int n) {
		int i, tab = 0;
		for(i = 0; i <= 10; i++) {
			tab = n*i;
			System.out.println(tab);
		}
		return tab;
	}
}
