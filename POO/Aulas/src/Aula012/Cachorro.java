package Aula012;

public class Cachorro extends Mamifero{
	//metodos
	public void enterrarOsso() {
		System.out.println("Enterrou");
	}
	
	public void abanarRabo() {
		System.out.println("Abanando");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("AUAUAU");
	}
}
