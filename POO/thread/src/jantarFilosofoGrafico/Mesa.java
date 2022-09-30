package jantarFilosofoGrafico;
import java.awt.Color;
import java.io.IOException;

import javax.swing.JButton;

public class Mesa {
	final static int NR_FILOSOFOS = 5;
	final static int PRIMEIRO_FILOSOFO = 0;
	final static int ULTIMO_FILOSOFO = NR_FILOSOFOS - 1;
	JButton garfosBut[];
	boolean[] garfos = new boolean[NR_FILOSOFOS];
	Estados[] filosofos = new Estados[NR_FILOSOFOS];

	int tentativas[] = new int[5];
	int comeuVezes[] = new int[5];
	long pensouTempo[] = new long[5];
	long mediaTempo[] = new long[5];
	long naoComeTempo[] = new long[5];
	long tempoMaximo[] = new long[5];
	long naoComeTempoTotal[] = new long[5];

	//constructor
	public Mesa(JButton garfosBut[]){
		for (int i = 0; i < 5; i++){
			garfos[i] = true;
			filosofos[i] = Estados.FAMINTO;
			this.garfosBut=garfosBut;
			tentativas[i]=0;comeuVezes[i]=0;pensouTempo[i]=0;mediaTempo[i]=0;naoComeTempo[i]=0;tempoMaximo[i]=0;naoComeTempoTotal[i]=0;
		}
	}

	public synchronized void pegarGarfos (int filosofo){
		garfosBut[filosofo].setBackground(Color.green);
		filosofos[filosofo] = Estados.FAMINTO;
		//enquanto os vizinhos estiverem comendo, espere!
		while (filosofos[aEsquerda(filosofo)] == Estados.COMENDO || filosofos[aDireita(filosofo)] == Estados.COMENDO){
			try{
				tentativas[filosofo]++;
				wait();
			}catch (InterruptedException e){

			}
		}
		garfos[garfoEsquerdo(filosofo)] = false;
		garfos[garfoDireito(filosofo)] = false;
		filosofos[filosofo] = Estados.COMENDO;

		//imprime dados

		exibirDados();
	}

	public synchronized void returningGarfos (int filosofo){
		garfosBut[filosofo].setBackground(Color.white);

		garfos[garfoEsquerdo(filosofo)] = true;
		garfos[garfoDireito(filosofo)] = true;

		//se algum vizinho parar de comer, notifica que o garfo ficou disponível
		if (filosofos[aEsquerda(filosofo)] == Estados.FAMINTO || filosofos[aDireita(filosofo)] == Estados.FAMINTO){
			notifyAll();
		}
		filosofos[filosofo] = Estados.PENSANDO;
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

	public void pensouTempo(int filosofo, int tempo) {
		this.pensouTempo[filosofo]=tempo;
	}

	public void naoComeuTempo(int filosofo, long tempo) {
		this.naoComeTempo[filosofo]=tempo;
	}

	public void comeuVezes(int filosofo) {
		this.comeuVezes[filosofo]++;
	}

	public void mediaTempo(int filosofo, long tempoEspera) {
		try {
			naoComeTempoTotal[filosofo]+=naoComeTempo[filosofo];
			this.mediaTempo[filosofo]= naoComeTempoTotal[filosofo]/comeuVezes[filosofo];
		}
		catch(ArithmeticException e) {
			naoComeTempoTotal[filosofo]+=naoComeTempo[filosofo];
			this.mediaTempo[filosofo]= naoComeTempoTotal[filosofo]/1;
		}
	}

	public void tempoMaximo(int filosofo, long tempo) {
		if(tempoMaximo[filosofo]<tempo)
			tempoMaximo[filosofo]=tempo;
	}

	public void exibirDados() {

		System.out.println("\n\n\n\n_Implementação Dijkstra_\n");
		System.out.println("\n_Tabela de tempo não come_");
		for(int i=0; i<5; i++) {
			System.out.println("Filosofo"+i+" não come a "+naoComeTempo[i]+" ms");
		}

		System.out.println("\n_Tabela de vezes_");
		for(int i=0; i<5; i++) {
			System.out.println("Filosofo"+i+" comeu "+comeuVezes[i]+" vezes");
		}

		System.out.println("\n_Tabela de médias de espera_");
		for(int i=0; i<5; i++) {
			System.out.println("Filosofo"+i+" pensa em média "+mediaTempo[i]+" ms");
		}

		System.out.println("\n_Tabela de tempo máximo de espera_");
		for(int i=0; i<5; i++) {
			System.out.println("Filosofo"+i+" pensou tempo maximo: "+tempoMaximo[i]+" ms");
		}

		System.out.println("\n_Tabela de tempo_");
		for(int i=0; i<5; i++) {
			System.out.println("Filosofo"+i+" pensou "+pensouTempo[i]+" ms");
		}


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