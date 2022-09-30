package motoqueiro;

import java.util.ArrayList;

public abstract class Entrega {
	ArrayList<Integer> entregas;
	Motoqueiro motoqueiro01;
	Motoqueiro motoqueiro02;
	boolean acabou=false;
	int i=0, posic=0;

	public Entrega(ArrayList<Integer> entregas, Motoqueiro motoqueiro01, Motoqueiro motoqueiro02) {
		this.entregas = entregas;
		this.motoqueiro01 = motoqueiro01;
		this.motoqueiro02 = motoqueiro02;
		
		while(!acabou) {
			decidirMotorista(i);
			i++;		
		}

		finalizar(motoqueiro01, motoqueiro02);

		printar();
	}

	public void printar() {
		System.out.println("_Total Entregas_");
		for(int i=0; i<entregas.size(); i++) {
			System.out.print(entregas.get(i)+" ");
		}

		System.out.println("\n\n_Entregas Motoqueiro01_");
		for(int i=0; i<motoqueiro01.comidas.size(); i++) {
			System.out.print(motoqueiro01.comidas.get(i)+" ");
		}

		System.out.println("\n\n_Entregas Motoqueiro02_");
		for(int i=0; i<motoqueiro02.comidas.size(); i++) {
			System.out.print(motoqueiro02.comidas.get(i)+" ");
		}

		System.out.println("\n\nTempo Motoqueiro01: "+motoqueiro01.tempoTotal+" min");
		System.out.println("\nTempo Motoqueiro02: "+motoqueiro02.tempoTotal+" min");

		if(motoqueiro01.tempoTotal >= motoqueiro02.tempoTotal) {
			System.out.println("\nMelhor tempo: "+motoqueiro01.tempoTotal);
		}
		else {
			System.out.println("\nMelhor tempo: "+motoqueiro02.tempoTotal+" min");
		}

		int diff=motoqueiro01.tempoTotal-motoqueiro02.tempoTotal;
		if(diff<0) {
			diff=diff*(-1);
		}
		System.out.println("\nDiferença: "+(diff)+" min");
	}


	public abstract void decidirMotorista(int i);

	public abstract void adicionar(Motoqueiro motoqueiro);
	
	public void finalizar(Motoqueiro motoqueiro01, Motoqueiro motoqueiro02) {

		/*motoqueiro01.comidas.set(
				motoqueiro01.comidas.size()-1,
				motoqueiro01.comidas.get(motoqueiro0	1.comidas.size()-1)/2
				);*/
		motoqueiro01.tempoTotal -= motoqueiro01.comidas.get(motoqueiro01.comidas.size()-1);

		/*motoqueiro02.comidas.set(
				motoqueiro02.comidas.size()-1,
				motoqueiro02.comidas.get(motoqueiro02.comidas.size()-1)/2
				);*/
		motoqueiro02.tempoTotal -= motoqueiro02.comidas.get(motoqueiro02.comidas.size()-1);
		
	}
}