package Ex04;

public class Pizza {
	//atributos
	private String nome;
	private double valor;
	private int numIngrediente;
	
	//constructor
	public Pizza() {System.out.println("Objeto criado!");}
	public Pizza(String nome, double valor, int numIngrediente) {
		this.nome=nome;
		this.valor=valor;
		this.numIngrediente=numIngrediente;
	}
	
	//metodos
	public void mostrar() {
		System.out.println(this.nome +" "+ this.valor +" "+ this.numIngrediente +"\n");
	}
}
