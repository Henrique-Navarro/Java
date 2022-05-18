package Ex04;

public class Tevelisao {
	//classe mais generica possível
	//atributos
	private int canal;
	private int volume;
	
	//constructor
	public Tevelisao() {
		this.setCanal(0);
		this.setVolume(0);
	}
	public Tevelisao(int canal, int volume) {
		this.setCanal(canal);
		this.setVolume(volume);
	}

	//metodos getters setters
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
}
