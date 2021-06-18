package ListaRevisaNP2.Q2;

public class ContaCorrenteEspecial extends ContaCorrente {
	
	public ContaCorrenteEspecial() {
		
		super();
	}
	
	public ContaCorrenteEspecial(double montante) {
		
		super(montante);
				
	}
	
	public void sacar(double quantia) {
		
		montante = (montante - quantia) - 0.1*quantia;
	}
}
