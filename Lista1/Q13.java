package Lista1;
import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		
		float n1, n2, soma, div, sub, mult;
		int i = 0, n;
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("Primeiro número: ");
			n1 = scan.nextFloat();
		
			System.out.println("Segundo número: ");
			n2 = scan.nextFloat();
		
			System.out.println("Digite 1 para somar\nDigite 2 para subtrair\nDigite 3 para mult\nDigite 4 para dividir\nDigite 5 para sair ");
			n = scan.nextInt();
		
			if(n == 1) {
			
				soma = (float)(n1+n2);
				System.out.println(soma);
			
			} else if (n == 2) {
			
				sub = (float)(n1-n2);
				System.out.println(sub);
			
			} else if (n == 3) {
			
				mult = (float)(n1*n2);
				System.out.println(mult);
			
			} else if (n == 4) {
			
				div = (float)(n1/n2);
				System.out.println(div);
			
			} else if (n == 5) {
			
				System.out.println("Fim");
				break;
			
			} else {
			
				System.out.println("Opção inválida");
			}		
		
		}

	}
}
