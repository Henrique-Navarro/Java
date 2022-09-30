/*
 * Feito por:
 * Henrique Navarro Morais
 * João Pedro Xavier
 * */
package encapsulamento;

public class CarroCorrida {
	//ATRIBUTTES
	private int numeroCarro;
	private String piloto;
	private String equipe;
	private double velocidadeMaxima;
	private double velocidadeAtual;
	private boolean ligado;

	//CONSTRUCTOR
	public CarroCorrida(int numeroCarro, String piloto, String equipe, double velocidadeMaxima) {
		this.numeroCarro=numeroCarro;
		this.piloto=piloto;
		this.equipe=equipe;
		this.velocidadeMaxima=velocidadeMaxima;
		this.ligado=false;
	}

	//METHODS
	public boolean estaLigado() {
		return ligado;
	}
	public boolean estaParado() {
		return velocidadeAtual==0? true: false;
	}
	public void ligar() {
		if(ligado==false)
			ligado=true;
	}
	public void desligar() {
		if(ligado==true&&velocidadeAtual==0)
			ligado=false;
	}
	public void acelerar(double porcentagem) {
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
	public void frear(double porcentagem) {
		if(ligado==true)
			velocidadeAtual-=(porcentagem/100)*velocidadeAtual;
		System.out.println("\nFreou Velocidade Atual: "+velocidadeAtual);

	}
	public void exibirDados() {
		System.out.println("CarroCorrida: \nnumeroCarro = " + numeroCarro + "\npiloto = " + piloto + "\nequipe = " + equipe
				+ "\nvelocidadeMaxima = " + velocidadeMaxima + "\nvelocidadeAtual = " + velocidadeAtual + "\nligado = "
				+ ligado);
	}

	//GETTERS SETTERS
	public int getNumeroCarro() {
		return numeroCarro;
	}
	public void setNumeroCarro(int numeroCarro) {
		this.numeroCarro = numeroCarro;
	}
	public String getPiloto() {
		return piloto;
	}
	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
	public String getEquipe() {
		return equipe;
	}
	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
}