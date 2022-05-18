package Aula011;

public class Aluno extends Pessoa{
	//atributos
	private int matricula;
	private String curso;
	
	//getters setters
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	//metodos
	public void pagarMensalidade() {
		System.out.println("Mensalidade de <Aluno> Paga!");
	}
}
