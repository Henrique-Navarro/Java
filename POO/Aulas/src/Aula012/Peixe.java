package Aula012;

public class Peixe extends Animal{
	//atributos
	private String corEscama;
	
	//metodos
	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Agua");
	}

	@Override
	public void emitirSom() {
		System.out.println("Não faz som");
	}
	
	public void soltarBolha() {
		System.out.println("BLURRBLUE");
	}

	//getters setters
	public String getCorEscama() {
		return corEscama;
	}
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
}
