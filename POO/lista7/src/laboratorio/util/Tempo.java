package laboratorio.util;

public class Tempo {
	//atributes
	private int hora;     //[0-23]
	private int minuto;   //[0-59]
	private int segundo;  //[0-59]
	
	//constructor
	public Tempo() {
		this.hora=0;
		this.minuto=0;
		this.segundo=0;
	}
	public void setTempo(int hora, int minuto, int segundo) {
		this.hora=hora;
		this.minuto=minuto;
		this.segundo=segundo;
	}
	
	//getters setters
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	//metodos
	public String exibirTempo() {
		return ""+hora+":"+minuto+":"+segundo+"";
	}
}
