package Aula012;
//herda classe generica animal
public class Mamifero extends Animal{
	//atributos
	private String corPelo;
	
	//metodos
	@Override
	public void locomover() {
		System.out.println("Andando");
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}

	@Override
	public void emitirSom() {
		System.out.println("Grita");
	}
	
	//getters setters
	public String getCorPelo() {
		return corPelo;
	}
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
}
