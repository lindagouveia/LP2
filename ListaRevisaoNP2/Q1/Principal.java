package ListaRevisaNP2.Q1;

public class Principal {

	public static void main(String[] args) {
		
		Adestrador adestrador = new Adestrador();
		
		for (int i = 0; i < 10; i++) {
			
			Animal animal = adestrador.adestrarAnimal();
			adestrador.brincar(animal);
		}
	}
}

