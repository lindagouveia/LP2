package Lista3.Q4;

public class PessoaFisica extends Pessoa {

	private String cpf;
	
	public PessoaFisica(int id, String nome){
		
		super(id);
		super.nome = nome;
	}
	
	 public String getCpf() {
	        return this.cpf;
	    }
	    
	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }
}
