package Aula012;

public class Ave extends Animal{
	//atributos
	private String corPena;
	
	//metodos
	@Override
	public void locomover() {
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		System.out.println("Semente");
	}

	@Override
	public void emitirSom() {
		System.out.println("COCORICOOOO");
	}

	public void fazerNinho() {
		System.out.println("Ninho feito");
	}
	
	//getters setters
	public String getCorPena() {
		return corPena;
	}
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
}
