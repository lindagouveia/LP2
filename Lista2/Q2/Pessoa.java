//Crie uma classe para representar uma pessoa, com os
//atributos públicos de nome, ano de nascimento e altura.
//Esta classe deve possuir os seguintes métodos
//○ Crie um método para imprimir todos os dados de uma pessoa.
//○ Crie um método para calcular a idade da pessoa

package Q2;

public class Pessoa {

	String nome;
	int ano;
	double altura;
	
	public void dados() {
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Ano de nascimento: " + this.ano);
		System.out.println("Altura: " + this.altura);
		
	}
	
	public void idade() {
		
		int IdadeAtual;
		
		IdadeAtual = 2021 - this.ano;
		
		System.out.println("Idade atual: " + IdadeAtual);
		
	}

}