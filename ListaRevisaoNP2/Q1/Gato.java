package ListaRevisaNP2.Q1;

public class Gato extends Animal {
	
	public String emitirSom() {
        return "Miando";
    }
   
    public void mover() {
        System.out.println("Gato se movendo");
    }
    
    public void descansar() {
        System.out.println("Gato descansando");
    }  

}
