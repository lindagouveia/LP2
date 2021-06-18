package ListaRevisaNP2.Q3;

public class ImovelNovo extends Imovel {
	
	public double adicional;
	
	public ImovelNovo(double preco, double adicional) {
		
		super(preco);
		this.adicional = adicional;
	}
	
	public double getAdicional() {
		
		return adicional;
	}

	public double CalculoImovelNovo() {
		
		return getPreco() + adicional;
	}
}
