package ListaRevisaNP2.Q4;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double altura;
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}

	public String getNome() {
		
		return nome;
	}
	
public void setIdade(int idade) {
		
		this.idade = idade;
	}

	public int getIdade() {
		
		return idade;
	}
	
public void setAltura(double altura) {
		
		this.altura = altura;
	}

	public double getAltura() {
		
		return altura;
	}
	
	public void Status() {
		
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Altura: " + getAltura());
	}
}
