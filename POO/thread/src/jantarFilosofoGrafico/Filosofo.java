package jantarFilosofoGrafico;

import java.awt.Color;

import javax.swing.JButton;

public class Filosofo implements Runnable{
	//Attributes
	final static int TEMPO_MAXIMO = 150;
	private Mesa mesa;
	private int filosofo;
	private String nome;
	private boolean stop=false;
	JButton filosofoBut;

	//Constructor
	public Filosofo (String nome, Mesa mesadejantar, int fil, JButton filosofoBut){
		this.nome=nome;
		this.mesa = mesadejantar;
		this.filosofo = fil;
		this.filosofoBut=filosofoBut;

		//inicia a Thread
		new Thread(this, nome).start();

		System.out.println(this.nome+" começou sua execução");
	}

	@Override
	public void run (){
		/* Filósofo
		 * 
		 * pensar
		 * getGarfos
		 * comer
		 * returnGarfos
		 * */

		while(!stop){
			pensar((int) (Math.random() * TEMPO_MAXIMO));
			
			final long tempoEsperaStart =  System.nanoTime();
			
			getGarfos();
			
			final long tempoEsperaEnd =  System.nanoTime();
			
			long tempoEspera=(tempoEsperaEnd - tempoEsperaStart) / 1000000;
			operacoesTempo(tempoEspera);
			
			comer((int) (Math.random() * TEMPO_MAXIMO));
			returnGarfos();
		}
		filosofoBut.setBackground(Color.white);
	}

	public void dead() {
		Thread.interrupted();
	}
	
	public void operacoesTempo(long tempoEspera) {
		mesa.naoComeuTempo(filosofo, tempoEspera);
		mesa.tempoMaximo(filosofo, tempoEspera);
		mesa.mediaTempo(filosofo, tempoEspera);
		System.out.println("\n\nTempoEspera:"+tempoEspera+"ms");
	}
	
	//metodos
	public void pensar (int tempo){
		try{
			filosofoBut.setBackground(Color.red);
			mesa.pensouTempo(filosofo, tempo);

			Thread.sleep(tempo);
		}catch (InterruptedException e){
			System.out.println("ERRO: O Filófoso pensou em demasia");
		}
	}

	public void comer (int tempo){
		try{
			filosofoBut.setBackground(Color.green);
			//System.out.println("Filosofo"+filosofo+" está comendo por "+tempo+"ms");
			mesa.comeuVezes(filosofo);

			Thread.sleep(tempo);
		}catch (InterruptedException e){
			System.out.println("ERRO: O Filósofo comeu em demasia");
		}
	}

	public void getGarfos(){
		mesa.pegarGarfos(filosofo);
	}
	public void returnGarfos(){
		mesa.returningGarfos(filosofo);
	}

}