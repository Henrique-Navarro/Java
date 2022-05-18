package Aula012;

public class Reptil extends Animal{
	//atributos
	private String corEscama;
	
	//metodos
	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}

	@Override
	public void alimentar() {
		System.out.println("Frutas");
	}

	@Override
	public void emitirSom() {
		System.out.println("TSHSSHHH");
	}
	
	//getters setters
	public String getCorEscama() {
		return corEscama;
	}
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
}
