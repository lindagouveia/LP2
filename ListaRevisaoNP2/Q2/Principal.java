package ListaRevisaNP2.Q2;

public class Principal {

	public static void main(String[] args) {
		
		ContaCorrente conta_linda = new ContaCorrente(700);
		ContaCorrenteEspecial conta_marcel = new ContaCorrenteEspecial(1000);
		
		conta_linda.depositar(100);
		System.out.println("O valor do saldo de Linda: " + conta_linda.saldo());
		
		conta_linda.sacar(50);
		System.out.println("O valor do saldo de Linda: " + conta_linda.saldo());
		
		conta_marcel.sacar(100);
		System.out.println("O valor do saldo de Marcel: " + conta_marcel.saldo());	

	}

}
