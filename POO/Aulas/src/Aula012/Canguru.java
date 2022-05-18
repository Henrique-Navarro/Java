package Aula012;

public class Canguru extends Mamifero{
	//metodos
	public void usarBolsa() {
		System.out.println("Usando bolsa");
	}
	
	@Override
	public void locomover() {
		System.out.println("Pulando");
	}
}	
