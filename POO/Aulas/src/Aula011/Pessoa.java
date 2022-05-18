package Aula011;

public abstract class Pessoa {
	//classe abstrata não pode gerar objetos
	//Pessoa p1 = new Pessoa()  <não pode>
	
	//atributos
	//protected pode ser acessado pela classe e seus filhos
	protected String nome;
	protected int idade;
	protected String sexo;
	
	//getters setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	//metodos
	public void fazerAniversario() {
		this.idade++;
	}
}
