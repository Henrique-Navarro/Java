package Ex05;

public class Conta {
	//atributos
	private String nome;
	private float valor;
	
	//constructor
	public Conta(String nome, float valor) {
		this.nome=nome;
		this.valor=valor;
	}
	
	//metodos
	public void mostrar() {
		System.out.println(this.nome +" possui R$"+ this.valor);
	}
}
