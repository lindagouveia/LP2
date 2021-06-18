/*Implemente uma superclasse Pessoa que possua os seguintes atributos: id do tipo inteiro, nome do
tipo cadeia de caracteres (String) e email do tipo cadeia de caracteres (String). O atributo id s� pode ser
diretamente vis�vel e acessado dentro da pr�pria classe Pessoa. J� o atributo nome s� pode ser diretamente
vis�vel e acessado dentro da classe Pessoa e das subclasses que herdam de Pessoa. J� o atributo email
pode ser diretamente vis�vel e acessado dentro da classe Pessoa, dentro das subclasses de Pessoa e por
meio dos objetos instanciados da classe Pessoa ou das subclasses de Pessoa. Como o atributo nome s�
pode ser diretamente acessado pela classe Pessoa e pelas subclasses de Pessoa, implemente um m�todo
que permita a leitura do valor do atributo nome por meio de objetos instanciados a partir da classe Pessoa e
de suas classes derivadas. Implemente tamb�m, pelo menos, uma subclasse de Pessoa. Por fim,
implemente uma classe Principal que possua o m�todo main e instancie um objeto da superclasse Pessoa e
dois objetos da subclasse de Pessoa. A resposta desta quest�o pode ser feita na linguagem Java*/

package Lista3.Q3;

public class Pessoa {
	
	private int id;
	protected String nome;
	public String email;
	
	public String getNome(){
		
		return nome;
	}
	
	public void setNome(String nome){
		
		this.nome = nome;
	}
	
	public int getId(){
		
		return id;
	}
	
	public void setId(int id){
		
		this.id = id;
	}
}
