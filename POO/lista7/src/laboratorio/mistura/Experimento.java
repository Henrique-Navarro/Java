package laboratorio.mistura;
import java.util.ArrayList;

public class Experimento {
	//atributes
	private ArrayList <Mistura> misturas;
	
	//constructor
	public Experimento() {
		misturas = new ArrayList <Mistura>();
	}
	public Experimento(Mistura m) {
		this.registrarMistura(m);
	}
	
	//metodos
	public boolean registrarMistura(Mistura m) {
		if(misturas.add(m)) {
			return true;
		}
		return false;
	}
	
	public void exibirExperimento() {
		System.out.println("\n=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=\nTodas as misturas["+misturas.size()+"]: \n");
		for(int i=0; i<misturas.size(); i++) {
			System.out.print("#0"+i+" ");
			misturas.get(i).exibirMistura();
		}
		System.out.println("=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=");
	}
}
