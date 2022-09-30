package Pck;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Pck.AcaoDosFilosofos.Acao;
import jantarFilosofoGrafico.Estados;
import jantarFilosofoGrafico.Filosofo;
import jantarFilosofoGrafico.Mesa;

public class View extends JFrame {
	private Random random = new Random(); // Variavel aleatória para gerar filosofo com fome.
	private Filosofos [] filosofos = new Filosofos[5]; // Variavel para armazenar os 5 filosofos presentes com as funções necessarias.
	private int tempoAtual; // Variavel do tempo atual que se encontra a mesa.
	private int x,y,z; // Variaveis genericas. 
	private double[] contaFomeLocal = new double [5]; // Variavel para contar quantas vezes cada filosofo ficou com fome.
	private boolean [] garfo = new boolean[5]; // Variavel que indica quais garfos estão disponiveis atualmente na mesa.
	private final int tempo = 100; // tempo limite de execução.
	private double fomeTotal = 0;
	private double contaFomeTotal = 0;
	private double fomeMedia = 0;
	private JPanel contentPane;

	int tentativas[] = new int[5];
	int comeuVezes[] = new int[5];
	long pensouTempo[] = new long[5];
	long mediaTempo[] = new long[5];
	long naoComeTempo[] = new long[5];
	long tempoMaximo[] = new long[5];
	long naoComeTempoTotal[] = new long[5];

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public int getTempoAtual() {
		return tempoAtual;
	}
	public void preparaJantar () {
		for( x = 0; x < 5; x++) {
			filosofos[x] = new Filosofos (Acao.PENSANDO);
			garfo[x] = true;
			tentativas[x]=0;comeuVezes[x]=0;pensouTempo[x]=0;mediaTempo[x]=0;naoComeTempo[x]=0;tempoMaximo[x]=0;naoComeTempoTotal[x]=0;
		}
	}


	public  void  filosofoTerminaRefeicao() {
		long tempoEsperaStart=  System.nanoTime();
		for (y = 0; y < 5; y++) {
			if(filosofos[y].getAcao() == Acao.COMENDO) {
				filosofos[y].setTempoComendo(filosofos[y].getTempoComendo()+1) ;
				if(filosofos[y].getTempoComendo()== 5) {
					synchronized (filosofos[y]) {
						if(y == 4) {
							//garfo[0] = true;
							liberaGarfo(0);
						}
						else {
							//garfo[y+1] = true;
							liberaGarfo(y+1);
						}
						garfo[y] = true;
						filosofos[y].setTempoComendo(0);
						filosofos[y].setAcao(Acao.PENSANDO);

						//PENSOU
						try {
							long tempoEsperaEnd= System.nanoTime();
							long tempoEspera=(tempoEsperaEnd - tempoEsperaStart)/100;

							naoComeTempo[y]=tempoEspera;
							tempoMaximo(tempoEspera, y);
							mediaTempo(tempoEspera, y);

							/*System.out.println("Pensou Tempo: "+pensouTempo[y]);
							System.out.println("Tempo Espera Start: "+ tempoEsperaStart);
							System.out.println("Tempo Espera End: "+ tempoEsperaEnd);
							System.out.println("Tempo Espera: "+ tempoEspera);*/
							pensouTempo[y]=(int) (Math.random() * 150);
							Thread.sleep(pensouTempo[y]);
						}
						catch(Exception e) {
							e.printStackTrace();
						}
						filosofos[y].notifyAll();
						filosofos[y].setSegurandoGarfo(false);
					}
				}
			}
		}
	}

	public void tempoMaximo(long tempo, int filosofo) {
		if(tempoMaximo[filosofo]<tempo)
			tempoMaximo[filosofo]=tempo;
	}

	public void mediaTempo(long tempo, int filosofo) {
		try {
			//naoComeTempoTotal[filosofo]+=naoComeTempoTotal[filosofo];
			naoComeTempoTotal[filosofo]+=tempo;
			mediaTempo[filosofo]= naoComeTempoTotal[filosofo]/(comeuVezes[filosofo]);
		}
		catch(ArithmeticException e) {
			naoComeTempoTotal[filosofo]+=tempo;
			mediaTempo[filosofo]= naoComeTempoTotal[filosofo]/1;
		}
	}

	public void liberaGarfo(int x) {
		garfo[x]=true;
	}

	public void geraFilosofosComFome() { // Função para mudar acção de um filósofo de PENSANDO para COM_FOME.
		y = 0;
		for(x = 0; x < 5; x++) {
			if (filosofos[x].getAcao() != Acao.PENSANDO) {
				y++;
			}
		}
		if(y != 5) {
			z = random.nextInt(5);
			//z=0;
			while(filosofos[z].getAcao() != Acao.PENSANDO) {
				z = random.nextInt(5);
				//z=0;
			}
			filosofos[z].setAcao(Acao.COM_FOME);
			contaFomeLocal[z]++;
			filosofos[z].setContaFome(contaFomeLocal[z]);

		}

	}
	public void filosofosTentamComer () {
		long tempoEsperaStart=  System.nanoTime();
		for (y = 0; y < 5; y++) {
			//tentativas[y]++;
			if(y == 4) {
				//x = 0;
				x=pegaGarfo(0);
			}
			else {
				//x = y + 1;
				x=pegaGarfo(y+1);
			}
			if((filosofos[y].getAcao() == Acao.COM_FOME)&&(filosofos[y].pegaGarfos(garfo[y],garfo[x]))) { // Garante que os 2 garfos ao lado do filosofo COM_FOME estão disponiveis, caso não estejam, gera sleep em pegarGarfos.
				garfo[x] = false;
				garfo[y]= false;

				comeuVezes[y]++;

				long tempoEsperaEnd=  System.nanoTime();
				long tempoEspera= (tempoEsperaEnd-tempoEsperaStart)/1000000;

			}
		}
	}

	public int pegaGarfo(int x) {
		return x;
	}

	public String temGarfo(boolean garfoString) {
		String trocaString;
		if(garfoString == false) {
			trocaString = "Sem garfo";
		}
		else {
			trocaString = "Com garfo";
		}
		return trocaString;
	}

	public void mostraMesa() { // Menu principal que mostra o funcionamento da mesa dos filosofos.

		System.out.println("\n\n\n\n_Implementação Própria_\n");
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

	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1036, 394);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		//botões filósofos
		JButton filosofo0 = new JButton("filosofo0");
		filosofo0.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		filosofo0.setBounds(254, 55, 100, 50);
		contentPane.add(filosofo0);

		JButton filosofo1 = new JButton("filosofo1");
		filosofo1.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		filosofo1.setBounds(397, 123, 100, 50);
		contentPane.add(filosofo1);

		JButton filosofo2 = new JButton("filosofo2");
		filosofo2.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		filosofo2.setBounds(356, 235, 100, 50);
		contentPane.add(filosofo2);

		JButton filosofo3 = new JButton("filosofo3");
		filosofo3.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		filosofo3.setBounds(175, 235, 100, 50);
		contentPane.add(filosofo3);

		JButton filosofo4 = new JButton("filosofo4");
		filosofo4.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		filosofo4.setBounds(120, 123, 100, 50);
		contentPane.add(filosofo4);


		//botões garfos
		JButton garfo0 = new JButton("0");
		garfo0.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		garfo0.setBounds(364, 82, 41, 37);
		garfo0.setBackground(Color.white);
		contentPane.add(garfo0);

		JButton garfo1 = new JButton("1");
		garfo1.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		garfo1.setBounds(380, 184, 44, 37);
		garfo1.setBackground(Color.white);
		contentPane.add(garfo1);

		JButton garfo2 = new JButton("2");
		garfo2.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		garfo2.setBounds(294, 258, 44, 37);
		garfo2.setBackground(Color.white);
		contentPane.add(garfo2);

		JButton garfo3 = new JButton("3");
		garfo3.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		garfo3.setBounds(193, 184, 49, 37);
		garfo3.setBackground(Color.white);
		contentPane.add(garfo3);

		JButton garfo4 = new JButton("4");
		garfo4.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		garfo4.setBounds(203, 75, 41, 37);
		garfo4.setBackground(Color.white);
		contentPane.add(garfo4);


		JButton start = new JButton("Start");
		start.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//final long tempoExecucaoStart =  System.nanoTime();
				//double tempoExecucao = tempoExecucaoStart/1000000000;
				//System.out.println("tempoExecucao "+tempoExecucao);


				while(true){ // Execução principal do programa
					filosofoTerminaRefeicao();
					filosofosTentamComer ();
					if (tempoAtual % 3 == 0) {
						geraFilosofosComFome();
					}
					mostraMesa();
				}

				/*for(int i = 0; i < 5; i++) {
					System.out.println("\nTempo médio que o " + filosofos[i].getNome() + "demorou para comer(ficou com fome): " + filosofos[i].getTempoComFome() / filosofos[i].getContaFome() + "\n");
					fomeTotal = fomeTotal + filosofos[i].getTempoComFome();
					contaFomeTotal = contaFomeTotal + filosofos[i].getContaFome();	
				}
				fomeMedia =  fomeTotal / contaFomeTotal ;
				System.out.println("\nTempo médio para os filósofos comerem " + fomeMedia);*/
			}
		});
		start.setBounds(26, 307, 89, 37);
		contentPane.add(start);

		System.out.println("\n Jantar dos Filósofos\n");
		preparaJantar();
	}
}