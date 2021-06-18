//1. Defina o que � um paradigma de programa��o

//R: Um paradigma � um estilo de programa��o, um modelo, uma metodologia. N�o se trata de uma linguagem, 
//mas a forma como voc� soluciona problemas usando uma determinada linguagem de programa��o.


//2. Apresente as principais caracter�sticas da programa��o estruturada e da
//programa��o orientada a objetos.

//R: A programa��o orientada a objetos � um modelo de programa��o onde diversas classes possuem caracter�sticas que 
//definem um objeto na vida real. Cada classe determina o comportamento do objeto definido por m�todos e seus estados 
//poss�veis definidos por atributos. 

//O princ�pio b�sico da programa��o estruturada � que um programa pode ser divido em tr�s partes que se interligam: 
//sequ�ncia, sele��o e itera��o.


//Quest�o 3:

package Lista1;
import java.util.Scanner;

public class Q12e3 {

	public static void main(String[] args) {
		
		float pi = 3.1415f;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Raio: ");
        
        float r = scan.nextFloat();
        float A = pi * r * r;
        System.out.print("A �rea do c�rculo �: " + A);
        
    }
}

