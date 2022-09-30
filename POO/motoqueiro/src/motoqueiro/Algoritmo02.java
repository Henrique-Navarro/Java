package motoqueiro;

import java.util.ArrayList;

public class Algoritmo02 extends Entrega{
	int menorDiff=10000;

	public Algoritmo02(ArrayList<Integer> entregas, Motoqueiro motoqueiro01, Motoqueiro motoqueiro02) {
		super(entregas, motoqueiro01, motoqueiro02);				
	}

	@Override
	public void decidirMotorista(int i) {
		for(int j=0; j<entregas.size(); j++) {
			for(int k=0; k<entregas.size(); k++) {
				//DIFERENTES
				if(j != k) {
					//QUEM É O MAIOR
					if(j > k) {
						//MAIOR - MENOR
						if(menorDiff > j-k) {
							menorDiff = entregas.get(j) - entregas.get(k); 
						}
					}
					else if(k > j){
						if(menorDiff > k-j) {
							menorDiff = entregas.get(k) - entregas.get(j); 
						}
					}
				}
			}
		}
		if(posic==entregas.size()) {acabou=true;}
	}

	@Override
	public void adicionar(Motoqueiro motoqueiro) {

	}
}