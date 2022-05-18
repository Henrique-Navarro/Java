package semaforo;

public enum CorSemaforo {
	//cada constante guarda um valor tempo
	VERDE(1500), VERMELHO(1000), AMARELO(500);
	
	//atributes
	private int tempoEspera;
	
	//constructor
	CorSemaforo(int tempoEspera){
		this.tempoEspera=tempoEspera;
	}

	//getter
	public int getTempoEspera() {
		return tempoEspera;
	}
}
