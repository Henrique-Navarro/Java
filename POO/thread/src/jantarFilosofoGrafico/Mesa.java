package jantarFilosofoGrafico;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;

public class Mesa {
	final static int NR_FILOSOFOS = 5;
	final static int PRIMEIRO_FILOSOFO = 0;
	final static int ULTIMO_FILOSOFO = NR_FILOSOFOS - 1;

	JButton garfosBut[];
	boolean[] garfos = new boolean[NR_FILOSOFOS];

	//vetor que contém todos os filosofos[5]
	Estados[] filosofos = new Estados[NR_FILOSOFOS];
	int[] tentativas = new int[NR_FILOSOFOS];

	//constructor
	public Mesa(JButton garfosBut[]){
		for (int i = 0; i < 5; i++){
			//deixa todos os garfos disponíveis
			//deixa todos os filósofos famintos
			//reseta todas as tentativas

			garfos[i] = true;
			filosofos[i] = Estados.FAMINTO;
			tentativas[i] = 0;
			
			this.garfosBut=garfosBut;
		}
	}

	public synchronized void pegarGarfos (int filosofo){
		//fazer semáforo
		garfosBut[filosofo].setBackground(Color.green);
		filosofos[filosofo] = Estados.FAMINTO;
		//enquanto os vizinhos estiverem comendo, espere!
		while (filosofos[aEsquerda(filosofo)] == Estados.COMENDO || filosofos[aDireita(filosofo)] == Estados.COMENDO){
			try{
				tentativas[filosofo]++;
				//COMENDO
				wait();
			}catch (InterruptedException e){

			}
		}
		/*
		Dando Starvation?
		System.out.println("O Filósofo morreu devido a starvation");
		tentativas[filosofo] = 0;
		 */

		//ocupa os garfos e fica COMENDO
		garfos[garfoEsquerdo(filosofo)] = false;
		garfos[garfoDireito(filosofo)] = false;
		filosofos[filosofo] = Estados.COMENDO;

		//imprime dados
		/*imprimeEstadosFilosofos();
		imprimeGarfos();
		imprimeTentativas();*/

	}

	public synchronized void returningGarfos (int filosofo){
		garfosBut[filosofo].setBackground(Color.white);
		//libera os garfos
		garfos[garfoEsquerdo(filosofo)] = true;
		garfos[garfoDireito(filosofo)] = true;

		//se algum vizinho parar de comer, notifica que o garfo ficou disponível
		if (filosofos[aEsquerda(filosofo)] == Estados.FAMINTO || filosofos[aDireita(filosofo)] == Estados.FAMINTO){
			notifyAll();
		}

		//para de COMENDO e fica PENSANDO
		filosofos[filosofo] = Estados.PENSANDO;

		//imprime Dados
		/*imprimeEstadosFilosofos();
		imprimeGarfos();
		imprimeTentativas();*/
		
	}

	public int aDireita (int filosofo){
		int direito;
		if (filosofo == ULTIMO_FILOSOFO){
			direito = PRIMEIRO_FILOSOFO;
		}else{
			direito = filosofo + 1;
		}
		return direito;
	}

	public int aEsquerda (int filosofo){
		int esquerdo;
		if (filosofo == PRIMEIRO_FILOSOFO){
			esquerdo = ULTIMO_FILOSOFO;
		}else{
			esquerdo = filosofo - 1;
		}
		return esquerdo;
	}

	public int garfoEsquerdo (int filosofo){
		int garfoEsquerdo = filosofo;
		return garfoEsquerdo;
	}

	public int garfoDireito (int filosofo){
		int garfoDireito;
		if (filosofo == ULTIMO_FILOSOFO){
			garfoDireito = 0;
		}else{
			garfoDireito = filosofo + 1;
		}
		return garfoDireito;
	}

	//imprime Dados
	/*
	public void imprimeEstadosFilosofos (){
		System.out.println("_Estados_");
		for (int i = 0; i < NR_FILOSOFOS; i++){
			switch (filosofos[i]){
			case PENSANDO :
				System.out.println(i+": PENSANDO ");
				break;
			case FAMINTO :
				System.out.println(i+": FAMINTO ");
				break;
			case COMENDO :
				System.out.println(i+": COMENDO ");
				break;
			}
		}
		System.out.println("\n");
	}*/

	/*public void imprimeGarfos (){
		System.out.println("_Garfos_");
		for (int i = 0; i < NR_FILOSOFOS; i++){
			if (garfos[i]){
				System.out.println(i+": Livre");
			}else{
				System.out.println(i+": Ocupado");
			}
		}
		System.out.println("\n");
	}*/

	/*public void imprimeTentativas (){
		System.out.println("_Tentativas_");
		for (int i = 0; i < NR_FILOSOFOS; i++){
			System.out.println(i+": "+tentativas[i]);
			//alterar estado do filosofo = mudar cor do botão
			//filosofo0.setBackground(Color.red);
		}
		System.out.println("\n");
	}*/
}