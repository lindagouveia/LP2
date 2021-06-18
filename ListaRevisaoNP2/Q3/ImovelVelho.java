package ListaRevisaNP2.Q3;

public class ImovelVelho extends Imovel {
	
	private double desconto;
	
	public ImovelVelho(double preco, double desconto) {
		
		super(preco);
		this.desconto = desconto;
	}
	
	public double getDesconto() {
		
		return desconto;
	}
	
	public double CalculoImovelVelho() {
		
		return getPreco() - desconto;
	}
}
