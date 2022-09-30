package jantarFilosofoMinhaImplementacao;

public class Filosofo extends Thread {

	private int filosofo; 
	private int estado; 
	private Jantar jantar; 

	int tentativas[] = new int[5];
	int comeuVezes[] = new int[5];
	int pensouTempo[] = new int[5];
	long mediaTempo[] = new long[5];
	long naoComeTempo[] = new long[5];
	long tempoMaximo[] = new long[5];
	long naoComeTempoTotal=0;
	
	public Filosofo(int chave, Jantar j) {
		this.filosofo = chave;		
		this.jantar = j;
	}

	public int getChave() { 
		exibirDados();
		return filosofo;
	}

	public void setStatus(int i) {
		estado = i;
		switch (i) {
		case 0:
			//jantar.SetInfo(filosofo, 0);
			break;
		case 1:
			//jantar.SetInfo(filosofo, 1);
			break;
		case 2:
			//jantar.SetInfo(filosofo, 2);
			break;
		}
	}

	private void pensando(int pensar) { 
		try {
			Thread.sleep(pensar);
		} catch (Exception e) {
		}
	}

	private void comendo(int comer) { 
		try {
			Thread.sleep(comer);
		} catch (Exception e) {
		}
	}

	public void run() {
		while (true) {
			setStatus(0);
			pensando((int) (Math.random() * 250)); 
			final long tempoEsperaStart =  System.nanoTime();
			jantar.fork.pegar(this);
			final long tempoEsperaEnd =  System.nanoTime();
			long tempoEspera=(tempoEsperaEnd - tempoEsperaStart) / 1000000;
			operacoesTempo(tempoEspera);
			comendo((int) (Math.random() * 250)); 
			jantar.fork.liberar(this); 
		}

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
			naoComeTempoTotal+=naoComeTempo[filosofo];
			this.mediaTempo[filosofo]= naoComeTempoTotal/comeuVezes[filosofo];
		}
		catch(ArithmeticException e) {
			naoComeTempoTotal+=naoComeTempo[filosofo];
			this.mediaTempo[filosofo]= naoComeTempoTotal/1;
		}
	}

	public void tempoMaximo(int filosofo, long tempo) {
		if(tempoMaximo[filosofo]<tempo)
			tempoMaximo[filosofo]=tempo;
	}
	
	public void operacoesTempo(long tempoEspera) {
		naoComeuTempo(filosofo, tempoEspera);
		tempoMaximo(filosofo, tempoEspera);
		mediaTempo(filosofo, tempoEspera);
		System.out.println("\n\nTempoEspera:"+tempoEspera+"ms");
	}
	
	public void exibirDados() {
		System.out.println("\n\n\n\n_Tabelas_\n");
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
}