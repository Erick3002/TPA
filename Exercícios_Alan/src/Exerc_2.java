import java.util. *;
public class Exerc_2 {
	public static void main(String[] args) {
		int b, e;
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira um número inteiro");
		b = ler.nextInt();
		System.out.println("Insira um expoente inteiro");
		e = ler.nextInt();
		System.out.println(quadrado(b,e));
	}
	public static int quadrado (int b, int e) {
		int i, x = 1;
		for (i = 0; i < e; i++) {
			x = x*b;
		}
		return x;
	}
}
