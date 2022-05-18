package Ex03;

public class Elevador {
	//atributos
	private int andarAtual;
	private int andarTotal;
	private int capacidadeAtual;
	private int capacidadeTotal;

	//constructor
	public Elevador() {}
	
	//metodos getters setters
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getAndarTotal() {
		return andarTotal;
	}
	public void setAndarTotal(int andarTotal) {
		this.andarTotal = andarTotal;
	}

	public int getCapacidadeAtual() {
		return capacidadeAtual;
	}
	public void setCapacidadeAtual(int capacidadeAtual) {
		this.capacidadeAtual = capacidadeAtual;
	}

	public int getCapacidadeTotal() {
		return capacidadeTotal;
	}
	public void setCapacidadeTotal(int capacidadeTotal) {
		this.capacidadeTotal = capacidadeTotal;
	}
	
	//metodos abstratos
	public void mostrarDadosTotal() {
		System.out.println("Andar total: "+this.getAndarTotal() +" Capacidade total: "+ this.getCapacidadeTotal());
	}
	public void mostrarDadosAtual() {
		System.out.println("Andar atual: "+this.getAndarAtual() +" Capacidade atual: "+ this.getCapacidadeAtual());
	}
	
	public void iniciar(int capacidadeTotal, int andarTotal) {
		this.setCapacidadeTotal(capacidadeTotal);
		this.setAndarTotal(andarTotal);
		this.setAndarAtual(0);
		this.setCapacidadeAtual(0);
	}
	
	public void entrar() {
		if(this.getAndarAtual() < this.getCapacidadeTotal()) {
			this.setCapacidadeAtual(capacidadeAtual+1);}
	}
	
	public void sair() {
		if(this.getCapacidadeAtual() > 0) {
			this.setCapacidadeAtual(getCapacidadeAtual()-1);}
	}
	
	public void subir() {
		if(this.getAndarAtual() < this.getAndarTotal()) {
			this.setAndarAtual(andarAtual+1);}
	}
	
	public void descer() {
		if(this.getAndarAtual() > 0) {
			this.setAndarAtual(andarAtual-1);}
	}
}
