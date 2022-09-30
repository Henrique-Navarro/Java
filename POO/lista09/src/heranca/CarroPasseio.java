/*
 * Feito por:
 * Henrique Navarro Morais
 * João Pedro Xavier
 * */
package heranca;

public class CarroPasseio extends Veiculo{
	//ATRIBUTTES
	private int quantidade_porta;
	
	//CONSTRUCTOR
	public CarroPasseio(int quantidade_porta) {
		//tipo veiculo, qtd portas, vel max
		super("Carro Passeio", quantidade_porta, 80);
		this.quantidade_porta=quantidade_porta;
	}
	
	//METHODS
	@Override
	public void exibirDados() {
		System.out.println("Veiculo: "+tipoVeiculo+"\nvelocidadeMaxima = " + velocidadeMaxima +"km/h\nligado = "
				+ ligado + "\nquantidade_porta = " + quantidade_porta+"\n");
	}
	
	//GETTERS SETTERS
	public int getQuantidade_porta() {
		return quantidade_porta;
	}
	public void setQuantidade_porta(int quantidade_porta) {
		this.quantidade_porta = quantidade_porta;
	}
}