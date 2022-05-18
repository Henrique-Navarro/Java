package Aula011;

public class Professor extends Pessoa{
	//atributos
	private String especialidade;
	private float salario;
	
	//getters setters
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	//metodos
	public void receberAumento() {
		this.salario+=1000;
	}
}
