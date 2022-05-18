package laboratorio.mistura;
import laboratorio.util.Tempo;

public class Mistura {
	//atributes
	private String nome;
	private Tempo tempo;
	
	//constructor
	public Mistura(String nome, laboratorio.util.Tempo tempo) {
		this.nome=nome;
		this.tempo=tempo;
	}
	
	//getters setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public laboratorio.util.Tempo getTempo() {
		return tempo;
	}
	public void setTempo(laboratorio.util.Tempo tempo) {
		this.tempo = tempo;
	}
	
	//metodos
	public void exibirMistura() {
		System.out.println("A mistura: "+getNome()+" foi produzida em: "+tempo.exibirTempo());
	}
}
