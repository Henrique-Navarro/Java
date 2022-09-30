package motoqueiro;

import java.util.ArrayList;

public class Algoritmo01 extends Entrega{

	public Algoritmo01(ArrayList<Integer> entregas, Motoqueiro motoqueiro01, Motoqueiro motoqueiro02) {
		super(entregas, motoqueiro01, motoqueiro02);
	}
	
	@Override
	public void decidirMotorista(int i) {

		//PRIMEIRA VEZ, AMBOS PEGAM
		if(i == 0) {
			adicionar(motoqueiro01);
			adicionar(motoqueiro02);
		}

		//DECIDIR MOTOQUEIRO
		else {
			motoqueiro01.entregaAtual--;
			motoqueiro02.entregaAtual--;

			//AMBOS ZERADOS, ESCOLHER O COM MENOR TEMPO
			if(motoqueiro02.entregaAtual==0 && motoqueiro01.entregaAtual==0) {
				if(motoqueiro01.tempoTotal >= motoqueiro02.tempoTotal) {
					adicionar(motoqueiro02);
				}
				else {
					adicionar(motoqueiro01);
				}
			}

			//ASSIM QUE A ENTREGA TERMINAR, JÁ PEGA OUTRA
			else{
				if(motoqueiro01.entregaAtual==0) {
					adicionar(motoqueiro01);
				}

				if(motoqueiro02.entregaAtual==0) {
					adicionar(motoqueiro02);
				}
			}
		}

		if(posic==entregas.size()) {acabou=true;}
	}

	public void adicionar(Motoqueiro motoqueiro) {
		motoqueiro.comidas.add(entregas.get(posic));
		motoqueiro.tempoTotal += entregas.get(posic)*2;
		motoqueiro.entregaAtual = entregas.get(posic);
		posic++;
	}
}
