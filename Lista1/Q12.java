package Lista1;
import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		
		int n, i = 1, fat = 1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Número: ");
		n = scan.nextInt();
		
		while(i <= n) {
			
			fat = fat*i;
			
			i++;
		}
		
		
		System.out.println("Fatorial de " + n + ": " + fat);

	}

}
