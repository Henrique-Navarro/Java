/*
 * Feito por:
 * Henrique Navarro Morais
 * João Pedro Xavier
 * */
package heranca;

public class CarroCorrida extends Veiculo{
	//ATRIBUTTES
	private int numeroCarro;
	private String equipe;

	//CONSTRUCTOR
	public CarroCorrida(int numeroCarro, String equipe) {
		//tipo veiculo, qtd portas, vel max
		super("Carro Corrida", 1, 350);
		this.numeroCarro=numeroCarro;
		this.equipe=equipe;
	}
	
	//METHODS
	@Override
	public void exibirDados() {
		System.out.println("Veiculo: "+tipoVeiculo+"\nvelocidadeMaxima = " + velocidadeMaxima +"km/h\nligado = "
				+ ligado + "\nquantidade_porta = " + quantidade_porta+"\nnumeroCarro: "+numeroCarro+"\nequipe: "+equipe+"\n");
	}
	
	//GETTERS SETTERS
	public int getNumeroCarro() {
		return numeroCarro;
	}
	public void setNumeroCarro(int numeroCarro) {
		this.numeroCarro = numeroCarro;
	}
	public String getEquipe() {
		return equipe;
	}
	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}
}