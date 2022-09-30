/*
 * Feito por:
 * Henrique Navarro Morais
 * João Pedro Xavier
 * */
package heranca;

public class Caminhao extends Veiculo{
	//ATRIBUTTES
	private float peso;

	//CONSTRUCTOR
	public Caminhao(float peso) {
		//tipo veiculo, qtd portas, vel max
		super("Caminhao", 2, 45);
		this.peso = peso;
	}

	//METHODS
	@Override
	public void exibirDados() {
		System.out.println("Veiculo: "+tipoVeiculo+"\nvelocidadeMaxima = " + velocidadeMaxima +"km/h\nligado = "
				+ ligado + "\nquantidade_porta = " + quantidade_porta+"\npeso: "+peso+"kg\n");
	}

	//GETTERS SETTERS
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
}