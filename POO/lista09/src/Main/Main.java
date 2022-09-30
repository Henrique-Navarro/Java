/*
 * Feito por:
 * Henrique Navarro Morais
 * João Pedro Xavier
 * */
package Main;

import java.util.ArrayList;
import java.util.Random;

import polimorfismo02.Caminhao;
import polimorfismo02.CarroCorrida;
import polimorfismo02.CarroPasseio;
import polimorfismo02.Moto;
import polimorfismo02.Veiculo;

public class Main {
	public static void main(String[] args) {
		//numeroCarro, equipe
		Veiculo carroCorrida = new CarroCorrida(10, "Os 666");
		//turbo ligado

		//numero portas
		Veiculo carroPasseio = new CarroPasseio(4);

		//bagagem
		Veiculo moto = new Moto(35);

		//peso capacidade, peso atual
		Veiculo caminhao = new Caminhao(560, 400);

		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
		veiculos.add(carroCorrida);
		veiculos.add(caminhao);
		veiculos.add(carroPasseio);
		veiculos.add(moto);

		for(int i=0; i<5; i++) {
			Random r =  new Random();
			double rand = (double)(r.nextInt(100)+1);
			System.out.println("Porcentagm acelerar: "+rand);

			for(int j=0; j<veiculos.size(); j++) {
				veiculos.get(j).acelerar(rand);
			}
		}
		
		double velocidadeMax = 0, velocidadeMin = 100000;
		int vencedor=0, perdedor=0;
		
		for(int j=0; j<veiculos.size(); j++) {
			if(veiculos.get(j).getVelocidadeAtual() >= velocidadeMax) {
				velocidadeMax=veiculos.get(j).getVelocidadeAtual();
				vencedor=j;
			}
			if(veiculos.get(j).getVelocidadeAtual() <= velocidadeMin) {
				velocidadeMin=veiculos.get(j).getVelocidadeAtual();
				perdedor=j;
			}
		}
		
		System.out.println("\nVencedor: ");
		veiculos.get(vencedor).exibirVeiculo();

		System.out.println("\nPerdedor: ");
		veiculos.get(perdedor).exibirVeiculo();
	}
}