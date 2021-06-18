package Lista3.Q5;
import java.util.List;

public class Cliente extends Pessoa {
	
	private String email;
	public List<Venda> venda;
	
	public Cliente(int id, String nome) {
		
		super(id);
		super.nome = nome;
	}
	
	public void setEmail(String email) {
		
		this.email = email;
	}
	
	public String getEmail() {
		
		return email;
	}
	
	public String getNome() {
		
		return nome;
	}

}
