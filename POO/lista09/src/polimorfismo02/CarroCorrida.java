/*
 * Feito por:
 * Henrique Navarro Morais
 * João Pedro Xavier
 * */
package polimorfismo02;

public class CarroCorrida extends Veiculo{
	//ATRIBUTTES
	private int numeroCarro;
	private String equipe;
	private boolean turbo;

	//CONSTRUCTOR
	public CarroCorrida(int numeroCarro, String equipe) {
		//tipo veiculo, qtd portas, vel max
		super("Carro Corrida", 1, 350);
		this.numeroCarro=numeroCarro;
		this.equipe=equipe;
		this.turbo= true;
	}

	//METHODS
	@Override
	public void exibirVeiculo() {
		System.out.println("Veiculo: "+tipoVeiculo+"\nvelocidadeMaxima = " + velocidadeMaxima +"km/h\nVelocidadeAtual: "+velocidadeAtual+"km/h\nligado = "
				+ ligado + "\nquantidade_porta = " + quantidade_porta+"\nnumeroCarro: "+numeroCarro+"\nequipe: "+equipe+"\nTurbo: "+turbo+"\n");
	}

	@Override
	public void acelerar(double porcentagem) {
		if(turbo==true)porcentagem*=2;
		System.out.println("Porcentagem aceleração: "+porcentagem+"%");
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
		System.out.println("Acelerou Velocidade Atual: "+velocidadeAtual+"\n");
	}

	public boolean turboLigado() {
		return turbo==true?true:false;
	}

	public void ligaTurbo() {
		if(turbo==false)turbo=true;
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
	public boolean isTurbo() {
		return turbo;
	}

	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
}