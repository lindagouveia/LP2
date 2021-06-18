package Lista1;
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);

	        System.out.println("Digite a vari�vel A da equa��o:");
	        int a = scan.nextInt();
	        
	        System.out.println("Digite a vari�vel B da equa��o:");
	        int b = scan.nextInt();
	        
	        System.out.println("Digite a vari�vel C da equa��o:");
	        int c = scan.nextInt();

	        if (a == 0) {
	        	
	            System.out.println("N�o � equa��o de segundo grau.");
	            
	        } else {
	        	
	            float delta = b * b - (4 * a * c);
	            System.out.println("Delta: " + delta);
	            
	            if (delta < 0) {
	            	
	                System.out.println("N�o existe raiz.");
	                
	            } else if (delta == 0) {
	            	
	                float raiz = (float) (((b * -1) + Math.sqrt(delta)) / (2 * a));
	                System.out.println("Raiz �nica. A raiz: " + raiz);
	                
	            } else {
	            	
	                float raiz1 = (float) (((b * -1) + Math.sqrt(delta)) / (2 * a));
	                float raiz2 = (float) (((b * -1) - Math.sqrt(delta)) / (2 * a));

	                System.out.println("Raiz 1: " + raiz1);
	                System.out.println("Raiz 2: " + raiz2);
	            }
	        }
	        scan.close();

	}

}
