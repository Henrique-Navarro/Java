package ifsuldeminas.funcionarios;

public class Professor {
	//ATTRIBUTES
	private String nome;
	private int suap;
	
	//CONSTRUCTOR
	public Professor(String nome, int suap) {
		this.nome = nome;
		this.suap = suap;
	}
	
	//GETTERS SETTERS
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

	//METHODS
	public String exibirProfessor() {
		return "\nProfessor: \nNome: " + nome + "\nSuap: " + suap+"\n";
	}
}
