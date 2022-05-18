package JantarDosFilosofos;

public class Filosofo implements Runnable{
	//Attributes
	final static int TEMPO_MAXIMO = 100;
	private Mesa mesa;
	private int filosofo;
	private String nome;

	//Constructor
	public Filosofo (String nome, Mesa mesadejantar, int fil){
		this.nome=nome;
		this.mesa = mesadejantar;
		this.filosofo = fil;

		//inicia a Thread
		new Thread(this, nome).start();

		System.out.println(this.nome+" começou sua execução");
	}

	@Override
	public void run (){
		//filósofo só PENSA e COME (get return garfo)
		int tempo = 0;
		while (true){	
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
	}
	
	//metodos
	public void pensar (int tempo){
		try{
			Thread.sleep(tempo);
		}catch (InterruptedException e){
			System.out.println("ERRO: O Filófoso pensou em demasia");
		}
	}

	public void comer (int tempo){
		try{
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