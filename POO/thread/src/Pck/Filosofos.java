package Pck;

import Pck.AcaoDosFilosofos.Acao;
public class Filosofos extends Thread{

	private int tempoComendo = 0;
	private double tempoComFome;
	private double contaFome;
	private String nome;
	private boolean segurandoGarfo = false;
	private Acao acao;
	
	/*int tentativas[] = new int[5];
	int comeuVezes[] = new int[5];
	long pensouTempo[] = new long[5];
	long mediaTempo[] = new long[5];
	long naoComeTempo[] = new long[5];
	long tempoMaximo[] = new long[5];
	long naoComeTempoTotal[] = new long[5];*/
	
	public Filosofos (Acao acao) {
		this.acao  = acao;
	}
	public int getTempoComendo() {
		return tempoComendo;
	}
	public void setTempoComendo(int tempoComendo) {
		this.tempoComendo = tempoComendo;
	}
	public double getTempoComFome() {
		return tempoComFome;
	}
	public void setTempoComFome(int tempoComFome) {
		this.tempoComFome = tempoComFome;
	}
	public double getContaFome() {
		return contaFome;
	}
	public void setContaFome(double contaFome) {
		this.contaFome = contaFome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isSegurandoGarfo() {
		return segurandoGarfo;
	}
	public void setSegurandoGarfo(boolean segurandoGarfo) {
		this.segurandoGarfo = segurandoGarfo;
	}
	public Acao getAcao() {
		return acao;
	}
	public void setAcao(Acao acao) {
		this.acao = acao;
	}

	public boolean pegaGarfos(boolean garfoA, boolean garfoB) {
		//tempoEsperaStart =  System.nanoTime();
		synchronized (this) {
			if ((garfoA) && (garfoB)) {
				acao = Acao.COMENDO;
				//double tempoEsperaTotal = (tempoEsperaStart)/1000000000;
				//tempoComFome=tempoEsperaTotal;
				return true;
			}
			else {
				try {
					//final long tempoEsperaStart =  System.nanoTime();
					acao = Acao.COMENDO;
					//double tempoEsperaTotal = (tempoEsperaStart)/1000000000;
					//tempoComFome=tempoEsperaTotal;
					sleep((int) (Math.random() * 150));
				}
				catch (Exception e) {
					System.out.println("Erro: " + e);
				}
				return false;
			}
		}
	}
}