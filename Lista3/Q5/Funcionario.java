package Lista3.Q5;
import java.util.List;

public class Funcionario extends Pessoa {

	protected double salario;
	public List<Venda> venda;
	
	public Funcionario(int id, String nome) {
		
		super(id);
		super.nome = nome;
	}
	
public void setSalario(double salario) {
		
		this.salario = salario;
	}
	
	public double getSalario() {
		
		return salario;
	}
	
	public String getNome() {
		
		return nome;
	}
	
}
