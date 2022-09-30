package polimorfismo01;

public abstract class Alarme {
	//ATRIBUTTES
	protected String volume;
	protected int tempoDuracao;

	//CONSTRUCTOR
	public Alarme(String volume, int tempoDuracao) {
		this.volume=volume;
		this.tempoDuracao=tempoDuracao;
	}

	//METHODS
	public abstract void tocar();

	//GETTERS SETTERS
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public int getTempoDuracao() {
		return tempoDuracao;
	}
	public void setTempoDuracao(int tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}
}