package semaforo;

import java.io.*;

public class ThreadSemaforo implements Runnable{
	//atributes
	private String nome;
	private CorSemaforo cor;

	//valor padrão=false
	private boolean parar;
	private boolean corMudou;

	//constructor
	public ThreadSemaforo(String nome) {
		this.nome=nome;
		this.cor= CorSemaforo.VERMELHO;
		new Thread(this, nome).start();

		//método para escrever no arquivo, passa String como parâmetro
		//escreverArquivo("Iniciado: " +this.getNome()+"\n");
		System.out.println("Iniciado: " +this.getNome()+"\n");
	}

	public void escreverArquivo(CorSemaforo dados) {
		try{
			String string= "";
			FileOutputStream arquivo = new FileOutputStream("arquivo.txt");
			PrintWriter pw = new PrintWriter(arquivo);

			string += dados +"\n";
			pw.print(string);
			
			pw.close();
			arquivo.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("Erro ao encontrar o arquivo");
		}
		catch(IOException e) {
			System.out.println("Erro ao fechar o arquivo");
		}
	}

	@Override
	public void run() {
		//enquanto não for solicitada a parar, continua a execução
		while(!parar) {
			try {
				//faz uma pausa de determinado tempo dependendo da cor
				//constante envia um tempo específico
				Thread.sleep(this.cor.getTempoEspera());

				this.mudarCor();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	//recebe uma cor como parâmetro e atribui a próxima cor
	private synchronized void mudarCor() {
		switch(this.cor) {
		case VERMELHO:
			this.cor= CorSemaforo.VERDE;
			break;

		case VERDE:
			this.cor= CorSemaforo.AMARELO;
			break;

		case AMARELO:
			this.cor= CorSemaforo.VERMELHO;
			break;
		}

		//notifica a Thread que a cor mudou
		this.corMudou = true;
		notify();
	}

	public synchronized void esperaCorMudar() {
		while(!this.corMudou) {
			try {
				//fica esperando até que a cor mude
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		this.corMudou = false;
	}

	//para a execução da Thread
	public synchronized void desligarSemaforo() {
		this.parar = true;
	}

	//getters
	public CorSemaforo getCor() {
		return cor;
	}
	public String getNome() {
		return nome;
	}
}
