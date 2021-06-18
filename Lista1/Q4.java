package Lista1;

import java.util.Scanner;

public class Q4
{
    public static void main(final String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        
        float n = scan.nextFloat();
        
        if (n > 0.0f) {
        	
            System.out.print("O quadrado do numero digitado é: " + n * n);
            
            float raizq = (float)Math.sqrt(n);
            
            System.out.print(" A raiz quadrada do numero digitado é: " + raizq);
        }
    }
}
