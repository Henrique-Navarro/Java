package polimorfismo01;

public class RelogioMedieval extends Alarme{
	//CONSTRUCTOR
	public RelogioMedieval(String volume, int duracao) {
		super(volume, duracao);
	}
	
	//METHODS
	public void tocar() {
		System.out.println("Tic Tac Toc...");
		System.out.println("tempo: "+tempoDuracao+" segundos");
		System.out.println("volume: "+volume+"\n");
	}
}
