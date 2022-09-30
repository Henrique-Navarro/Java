package polimorfismo01;

public class Despertador extends Alarme{
	//CONSTRUCTOR
	public Despertador(String volume, int duracao) {
		super(volume, duracao);
	}
	
	//METHODS
	public void tocar() {
		System.out.println("TRiiiiiiiiiiiimmmmmmmm.....");
		System.out.println("tempo: "+tempoDuracao+" segundos");
		System.out.println("volume: "+volume+"\n");
	}
}
