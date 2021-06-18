package Lista1;

import java.util.Scanner;

public class Q5
{
    public static void main(final String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Quanto voce ganha/hr? ");
        float sal = scan.nextFloat();
        
        System.out.print("\nQuantas horas voce trabalha/mes? ");
        float h = scan.nextFloat();
        float salB = sal * h;
        
        System.out.print("\nSalario Bruto: " + salB);
        float IR = (float)(salB * 0.11);
        
        System.out.print("\nIR 11%: " + IR);
        float INSS = (float)(salB * 0.08);
        
        System.out.print("\nINSS 5%: " + INSS);
        float sind = (float)(salB * 0.05);
        
        System.out.print("\nSindicato 5%: " + sind);
        float vT = IR + INSS + sind;
        float salL = salB - vT;
        
        System.out.print("\nSalario liquido: " + salL);
    }
}