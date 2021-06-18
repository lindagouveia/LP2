package Q4;

public class Disciplina {
	
	public String nome;
	public int cod;
	public Professor professor;
	
	Disciplina (String nome, int cod) {
		
		this.nome = nome;
		this.cod = cod;
	}
	
	public String getNomeDisciplina() {
		
		return this.nome; 
	
	}
	
	public void setProfessor(Professor professor) {
		
		this.professor = professor;
		
	}
	
	public String getNomeProfessor() {
		
		return this.professor.nome;
	}
}
