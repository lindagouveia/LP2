//1. Defina o que é um paradigma de programação

//R: Um paradigma é um estilo de programação, um modelo, uma metodologia. Não se trata de uma linguagem, 
//mas a forma como você soluciona problemas usando uma determinada linguagem de programação.


//2. Apresente as principais características da programação estruturada e da
//programação orientada a objetos.

//R: A programação orientada a objetos é um modelo de programação onde diversas classes possuem características que 
//definem um objeto na vida real. Cada classe determina o comportamento do objeto definido por métodos e seus estados 
//possíveis definidos por atributos. 

//O princípio básico da programação estruturada é que um programa pode ser divido em três partes que se interligam: 
//sequência, seleção e iteração.


//Questão 3:

package Lista1;
import java.util.Scanner;

public class Q12e3 {

	public static void main(String[] args) {
		
		float pi = 3.1415f;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Raio: ");
        
        float r = scan.nextFloat();
        float A = pi * r * r;
        System.out.print("A área do círculo é: " + A);
        
    }
}

