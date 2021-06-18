package Lista1;

import java.util.Scanner;

public class Q7
{
    public static void main(final String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Salario: ");
        float sal = scan.nextFloat();
        
        System.out.print("Prestacao: ");
        float prest = scan.nextFloat();
        
        if (prest > 0.2 * sal) {
            System.out.print("Emprestimo nao concedido");
        }
        else {
            System.out.print("Emprestimo concedido");
        }
    }
}