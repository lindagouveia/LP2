package NP2.Q5;

public class Principal {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
	
		c1.depositar(200);
		
		System.out.println("O saldo ap�s o deposito � de " + c1.getSaldo());
		
	}

}
