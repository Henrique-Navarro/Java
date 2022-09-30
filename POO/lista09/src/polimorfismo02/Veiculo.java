/*
 * Feito por:
 * Henrique Navarro Morais
 * João Pedro Xavier
 * */
package polimorfismo02;

public abstract class Veiculo {
	//ATRIBUTTES
	protected double velocidadeMaxima;
	protected double velocidadeAtual;
	protected boolean ligado;
	protected String piloto;
	protected int quantidade_porta;
	protected String tipoVeiculo;

	//CONSTRUCTOR
	public Veiculo(String tipoVeiculo, int quantidade_porta, double velocidadeMaxima) {
		this.tipoVeiculo=tipoVeiculo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidadeAtual = 0;
		this.ligado = false;
		this.quantidade_porta = quantidade_porta;
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
	
	public void exibirVeiculo() {
		System.out.println("Erro, veículo de tipo indefinido");
	}
	
	//GETTERS SETTERS
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
	public String getPiloto() {
		return piloto;
	}
	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
	public int getQuantidade_porta() {
		return quantidade_porta;
	}
	public void setQuantidade_porta(int quantidade_porta) {
		this.quantidade_porta = quantidade_porta;
	}
}