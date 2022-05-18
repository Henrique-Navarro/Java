package Ex02;

public class Funcionario {
	//atributos
	String nome;
	double salario;
	String cargo;
	char sexo;
	int idade;	
	
	//constructor
	public Funcionario(){System.out.println("Objeto Criado");}
	
	public Funcionario(String nome, double salario, String cargo, char sexo, int idade) {
		this.nome=nome;
		this.salario=salario;
		this.cargo=cargo;
		this.sexo=sexo;
		this.idade=idade;
	}
}
