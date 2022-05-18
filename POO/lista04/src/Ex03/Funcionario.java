package Ex03;

public class Funcionario {
	//atributos
	String nome;
	double salario;
	String cargo;
	char sexo;
	int idade;	
	
	//constructor default
	public Funcionario(){System.out.println("Objeto Criado");}
	
	//constructor parametros
	public Funcionario(String nome, double salario, String cargo, char sexo, int idade) {
		this.nome=nome;
		this.salario=salario;
		this.cargo=cargo;
		this.sexo=sexo;
		this.idade=idade;
	}
	
	//metodos
	public void mostrar() {
		System.out.println(this.nome +" "+ this.salario +" "+ this.cargo +" "+ this.sexo +" "+ this.idade +"\n");
	}
}