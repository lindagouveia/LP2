package NP2.Q5;

public class Conta {
	
	private String nome;
	private double saldo;
	
	public void depositar(double valor) {
		
		saldo = (saldo + valor) + 0.1*saldo;
		
	}
	
	public String getNome() {
		
		return nome;
	}
	
	public double getSaldo() {
		
		return saldo;
	}

}
