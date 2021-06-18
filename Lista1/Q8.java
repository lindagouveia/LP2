package Lista1;
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);

	        System.out.println("Digite a variável A da equação:");
	        int a = scan.nextInt();
	        
	        System.out.println("Digite a variável B da equação:");
	        int b = scan.nextInt();
	        
	        System.out.println("Digite a variável C da equação:");
	        int c = scan.nextInt();

	        if (a == 0) {
	        	
	            System.out.println("Não é equação de segundo grau.");
	            
	        } else {
	        	
	            float delta = b * b - (4 * a * c);
	            System.out.println("Delta: " + delta);
	            
	            if (delta < 0) {
	            	
	                System.out.println("Não existe raiz.");
	                
	            } else if (delta == 0) {
	            	
	                float raiz = (float) (((b * -1) + Math.sqrt(delta)) / (2 * a));
	                System.out.println("Raiz única. A raiz: " + raiz);
	                
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
