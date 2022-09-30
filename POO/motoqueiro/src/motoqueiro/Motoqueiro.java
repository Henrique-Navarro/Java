package motoqueiro;

import java.util.ArrayList;

public class Motoqueiro {
	ArrayList<Integer> comidas;
	int tempoTotal;
	int entregaAtual;

	public Motoqueiro() {
		this.comidas = new ArrayList<Integer>();
		this.tempoTotal = 0;
		this.entregaAtual = 0;
	}

	public void printarDados() {
		System.out.println("\nTempo Total: "+tempoTotal);
		System.out.println("Entrega Atual: "+entregaAtual);
		System.out.print("Comidas: ");
		for(int i=0; i<comidas.size(); i++) {
			System.out.print(comidas.get(i)+" ");
		}
	}
}
