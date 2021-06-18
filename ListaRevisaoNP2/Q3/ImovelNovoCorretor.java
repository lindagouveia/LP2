package ListaRevisaNP2.Q3;

public class ImovelNovoCorretor extends ImovelNovo{
	
	private double porcentagem;
	
	public ImovelNovoCorretor(double preco, double porcentagem, double adicional) {
		
		super(preco, adicional);
		this.porcentagem = porcentagem;
	}

	public double CalculoImovelVelho() {
		
		double valor = getPreco() + getAdicional();
        valor = valor + valor*porcentagem;
        return valor;
	}
}
