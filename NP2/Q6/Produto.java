package NP2.Q6;

public abstract class Produto {
	
	public String nome;
	public double preco;
	private int id;
	
	public Produto(String nome, double preco) {
	
		this.nome = nome;
		this.preco = preco;
	}
	
	public void setId(int id) {
		
		this.id = id;
	}
	
	public int getId() {
		
		return id;
	}
	
	public abstract void Atualizar(String nome, double preco);
	public abstract void mostrarDados();
	

}
