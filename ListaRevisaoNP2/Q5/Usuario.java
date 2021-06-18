package ListaRevisaNP2.Q5;

public class Usuario {
	
	private static int id = 0;

    public Usuario() {
        incremento();
    }  
    private static void incremento() {
        id++;
    }
    public int getId(){
        return id;
    }

}
