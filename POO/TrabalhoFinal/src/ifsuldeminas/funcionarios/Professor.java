package ifsuldeminas.funcionarios;

public class Professor {
	//attributes
	private String nome;
	private int suap;
	
	//constructor
	public Professor(String nome, int suap) {
		this.nome = nome;
		this.suap = suap;
	}
	
	//getters setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSuap() {
		return suap;
	}
	public void setSuap(int suap) {
		this.suap = suap;
	}

	//metodos
	public String exibirProfessor() {
		return "Professor [nome=" + nome + ", suap=" + suap + "]";
	}
}
