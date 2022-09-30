package polimorfismo01;

public class Ambulancia extends Alarme{
	//CONSTRUCTOR
	public Ambulancia(String volume, int duracao) {
		super(volume, duracao);
	}
	
	//METHODS
	public void tocar() {
		System.out.println("Woo Waa Woo Waa...");
		System.out.println("tempo: "+tempoDuracao+" segundos");
		System.out.println("volume: "+volume+"\n");
	}
}
