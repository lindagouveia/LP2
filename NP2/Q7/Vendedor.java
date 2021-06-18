package NP2.Q7;

public class Vendedor extends Funcionario{
	
    private int qtdVendas;

    public Vendedor(String nome) {
        super(nome);
    }

    public Vendedor(int qtdVendas, String nome, int id) {
        super(nome, id);
        this.qtdVendas = qtdVendas;
    }

    
    public void mostrarDados(){
        int id = getId();
        System.out.println(this.nome+this.qtdVendas+id);
    }
    
    public void fazerVenda(){
        System.out.println("Venda realizada");
        this.qtdVendas =+1;
    }
    
    
}