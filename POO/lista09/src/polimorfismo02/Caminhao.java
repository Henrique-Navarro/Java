/*
 * Feito por:
 * Henrique Navarro Morais
 * João Pedro Xavier
 * */
package polimorfismo02;

public class Caminhao extends Veiculo{
	//ATRIBUTTES
	private float peso;
	private double pesoAtual;

	//CONSTRUCTOR
	public Caminhao(float peso, double pesoAtual) {
		//tipo veiculo, qtd portas, vel max
		super("Caminhao", 2, 45);
		this.peso = peso;
		this.pesoAtual=pesoAtual;
	}

	//METHODS
	@Override
	public void exibirVeiculo() {
		System.out.println("Veiculo: "+tipoVeiculo+"\nvelocidadeMaxima = " + velocidadeMaxima +"km/h\nVelocidadeAtual: "+velocidadeAtual+"km/h\nligado = "
				+ ligado + "\nquantidade_porta = " + quantidade_porta+"\npeso capacidade: "+peso+"kg\npeso atual: "+pesoAtual+"\n");
		
	}
	
	@Override
	public void acelerar(double porcentagem) {
		if(pesoAtual>(peso/2))porcentagem/=2;
		System.out.println("Acelerar Caminhão: "+porcentagem);
		double velocidade=0;
		if(ligado==true) {
			if(velocidadeAtual!=0) {
				velocidade=(porcentagem/100)*velocidadeAtual+velocidadeAtual;
				if(velocidade<=velocidadeMaxima) 
					velocidadeAtual=velocidade;
			}
			else {
				velocidadeAtual=(porcentagem/100)*velocidadeMaxima;
			}
		}
		else {
			velocidadeAtual=(porcentagem/100)*velocidadeMaxima;
		}
		System.out.println("\nAcelerou Velocidade Atual: "+velocidadeAtual);
	}
	
	//GETTERS SETTERS
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public double getPesoAtual() {
		return pesoAtual;
	}
	public void setPesoAtual(double pesoAtual) {
		this.pesoAtual = pesoAtual;
	}
}