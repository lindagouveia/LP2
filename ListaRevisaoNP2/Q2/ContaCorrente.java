package ListaRevisaNP2.Q2;

public class ContaCorrente implements OperacoesBancarias {
	
	protected double montante;
	
	public ContaCorrente() {
		
		this.montante = 0;
		
	}
	
	public ContaCorrente(double montante) {
		
		this.montante = montante;
	}
	
	public void depositar(double quantia) {
		
		montante = montante + quantia;
		
	}
	
	public void sacar(double quantia) {
		
		montante = (montante - quantia) - 0.5*quantia;
	}
	
	public double saldo() {
		
		return montante;
		
	}
}
