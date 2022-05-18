package Ex01;

public class Pessoa {
	//atributos
	String nome;
	int cpf;
	int idade;
	String sexo;
	
	//constructor
	public Pessoa(String nome, int cpf, int idade, String sexo){
		this.nome=nome;
		this.cpf=cpf;
		this.idade=idade;
		this.sexo=sexo;
	}
	
	//métodos
	public void mostrar(){
		System.out.println(nome +' '+ cpf +' '+ idade +' '+ sexo);	
	}
}
