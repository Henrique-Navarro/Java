/*
 * Feito por:
 * Henrique Navarro Morais
 * João Pedro Xavier
 * */
package heranca;

public class Moto extends Veiculo{
	//ATRIBUTTES
	private int bagagem;

	//CONSTRUCTOR
	public Moto(int bagagem) {
		//tipo veiculo, qtd portas, vel max
		super("Moto", 0, 120);
		this.bagagem= bagagem; 
	}

	//METHODS
	@Override
	public void exibirDados() {
		System.out.println("Veiculo: "+tipoVeiculo+"\nvelocidadeMaxima = " + velocidadeMaxima +"km/h\nligado = "
				+ ligado + "\nquantidade_porta = " + quantidade_porta+"\nbagagem: "+bagagem+"\n");
	}

	//GETTERS SETTERS
	public int getBagagem() {
		return bagagem;
	}
	public void setBagagem(int bagagem) {
		this.bagagem = bagagem;
	}
}