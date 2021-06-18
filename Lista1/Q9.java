package Lista1;

import java.util.Scanner;

public class Q9
{
    public static void main(final String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nota 1: ");
        float n1 = scan.nextFloat();
        
        System.out.print("Nota 2: ");
        float n2 = scan.nextFloat();
   
        final float m = (n1 + n2) / 2.0f;
        if (m >= 7.0f) {
        	
            System.out.print("Aprovado");
        }
        else if (m < 4.0f) {
        	
            System.out.print("Reprovado");
        }
        else {
        	
            System.out.print("Final");
        }
    }
}