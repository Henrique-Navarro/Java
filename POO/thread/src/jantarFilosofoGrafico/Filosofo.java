package jantarFilosofoGrafico;

import java.awt.Color;

import javax.swing.JButton;

public class Filosofo extends View implements Runnable{
	//Attributes
	final static int TEMPO_MAXIMO = 500;
	private Mesa mesa;
	private int filosofo;
	private String nome;
	boolean stop=false;

	private int comeuVezes[] = new int[5];
	private int pensouTempo[] = new int[5];
	private float mediaTempo[] = new float[5];

	JButton filosofoBut;

	//Constructor
	public Filosofo (String nome, Mesa mesadejantar, int fil, JButton filosofoBut){
		this.nome=nome;
		this.mesa = mesadejantar;
		this.filosofo = fil;
		this.filosofoBut=filosofoBut;

		for(int i=0; i<5; i++) {comeuVezes[i]=0;pensouTempo[i]=0;mediaTempo[i]=0;}
		
		//inicia a Thread
		new Thread(this, nome).start();

		System.out.println(this.nome+" começou sua execução");
	}

	@Override
	public void run (){
		//filósofo só PENSA e COME (get return garfo)
		int tempo = 0;
		while(!stop){
			//gerar tempo aleatório (previne Deadlock) entre 0.1 e 0.5
			tempo = (int) (Math.random() * TEMPO_MAXIMO);
			//System.out.println("tempo:" +tempo);
			pensar(tempo);
			getGarfos();
			tempo = (int) (Math.random() * TEMPO_MAXIMO);
			//System.out.println("tempo:" +tempo);
			comer(tempo);
			returnGarfos();
		}
		filosofoBut.setBackground(Color.white);
	}

	//metodos
	public void pensar (int tempo){
		try{
			filosofoBut.setBackground(Color.red);
			pensouTempo[filosofo]=tempo;
			//System.out.println("Filosofo"+filosofo+" não come a "+pensouTempo[filosofo]+"ms");
			calcularMedia(pensouTempo);

			//metodo calcularMediaTempo

			Thread.sleep(tempo*50);
		}catch (InterruptedException e){
			System.out.println("ERRO: O Filófoso pensou em demasia");
		}
	}

	public void comer (int tempo){
		try{
			filosofoBut.setBackground(Color.green);
			System.out.println("Filosofo"+filosofo+" está comendo por "+tempo+"ms");
			comeuVezes[filosofo]+=comeuVezes[filosofo]+1;

			//comeuVezes(comeuVezes);

			Thread.sleep(tempo*50);
		}catch (InterruptedException e){
			System.out.println("ERRO: O Filósofo comeu em demasia");
		}
	}

	public void getGarfos(){
		mesa.pegarGarfos(filosofo);
		exibirDados(pensouTempo, comeuVezes);
	}
	public void returnGarfos(){
		mesa.returningGarfos(filosofo);
	}

	public void exibirDados(int pensouTempo[], int comeuVezes[]) {
		calcularMedia(pensouTempo);
		comeuVezes(comeuVezes);
	}

	public void calcularMedia(int pensouTempo[]) {
		System.out.println("Tabela de tempo:");
		for(int filosofo=0; filosofo<5; filosofo++) {
			System.out.println("Filosofo"+filosofo+" está pensando por "+pensouTempo[filosofo]+"ms");
		}
		System.out.println("\n");
	}

	public void comeuVezes(int comeuVezes[]) {
		System.out.println("Tabela de vezes:");
		for(int filosofo=0; filosofo<5; filosofo++) {
			System.out.println("Filosofo"+filosofo+" comeu "+comeuVezes[filosofo]+"vezes");
		}
		System.out.println("\n");
	}
}