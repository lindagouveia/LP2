package NP2.Q6;

public class Brinquedo extends Produto{
	
	public Brinquedo(String nome, double preco) {
		
		super(nome, preco);
	}
	
	public void Atualizar(String nome, double preco) {
		
		this.nome = nome;
		this.preco = preco;
	}
	
	public void mostrarDados() {
		
		System.out.println("Nome: " + nome);
		System.out.println("Preco: " + preco);
		System.out.println("Id: " + getId());
		
		
	}

}
