package util;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import algoritmos.Metodo01;
import algoritmos.Metodo02;
import algoritmos.Metodo03;

import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class View extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

	static long tamVirtual;
	static long tamFisica;
	static long acessos;

	static long memVirtual[];
	static long memFisica[];
	static long arrayAcessos[];

	static Metodo01 metodo01;
	static Metodo02 metodo02;
	static Metodo03 metodo03;

	int hit = 0, miss = 0, ultimaPosic = 0, substituidas=0, pageFault=0, vezes=0;
	boolean encontrou=false;

	JLabel btnOtimo, btnAleatorio, nUsada, fifo, segunda, menosUsada, btn_1, btn_11, btn_2, btn_3, btn_4, btn_5;


	//MAIN
	public static void main(String[] args) {
		//INTERFACE
		EventQueue.invokeLater(new Runnable() {public void run() {try {View frame = new View();frame.setVisible(true);} catch (Exception e) {e.printStackTrace();}}});

		Arquivo arq = new Arquivo("./testes/teste1.txt");
		memFisica = arq.memFisica;
		memVirtual = arq.memVirtual;
		arrayAcessos = arq.arrayAcessos;

		metodo01 = new Metodo01(memFisica, memVirtual, arrayAcessos);
		metodo02 = new Metodo02(memFisica, memVirtual, arrayAcessos);
		metodo03 = new Metodo03(memFisica, memVirtual, arrayAcessos);
	}



	public View() {
		try {


			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 1318, 633);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(new BorderLayout(0, 0));
			contentPane.add(tabbedPane);


			//MÉTODO 01 (PASSO A PASSO)
			JPanel panel_1 = new JPanel();
			tabbedPane.addTab("Método 01", null, panel_1, null);

			//ALGORITMO OTIMO
			JButton algoritmoOtimo01 = new JButton("Algoritmo Otimo");
			algoritmoOtimo01.setBounds(8, 11, 182, 40);
			algoritmoOtimo01.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					metodo01.inicializarMemoria();

					System.out.println("_ÓTIMO_");
					JButton btnNewButton_2 = new JButton("+");
					btnNewButton_2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							metodo01.algoritmoOtimo();
						}
					});
					btnNewButton_2.setBounds(200, 20, 50, 23);
					panel_1.add(btnNewButton_2);

				}
			});
			panel_1.setLayout(null);
			panel_1.add(algoritmoOtimo01);





			//SUBSTITUIÇÃO ALEATÓRIA
			JButton aleatorio01 = new JButton("Substituição Aleatoria");
			aleatorio01.setBounds(8, 46, 182, 40);
			aleatorio01.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					metodo01.inicializarMemoria();
					System.out.println("_ALEATÓRIO_");
					JButton btnNewButton = new JButton("+");
					btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							metodo01.algoritmoAleatorio();
						}
					});
					btnNewButton.setBounds(200, 55, 50, 23);
					panel_1.add(btnNewButton);
				}
			});
			panel_1.add(aleatorio01);


			//NÃO USADA RECENTEMENTE
			JButton naoUsadaRecentemente01 = new JButton("Não Usada Recentemente");
			naoUsadaRecentemente01.setBounds(8, 86, 182, 40);
			naoUsadaRecentemente01.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					metodo01.inicializarMemoria();
					System.out.println("_NÃO USADA RECENTEMENTE_");
					JButton btnNewButton_1 = new JButton("+");
					btnNewButton_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							metodo01.naoUsadaRecentemente();
						}
					});
					btnNewButton_1.setBounds(200, 95, 50, 23);
					panel_1.add(btnNewButton_1);
				}
			});
			panel_1.add(naoUsadaRecentemente01);


			//FIFO
			JButton fifo01 = new JButton("FIFO");
			fifo01.setBounds(8, 126, 182, 40);
			fifo01.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					metodo01.inicializarMemoria();
					System.out.println("_FIFO_");
					JButton btnNewButton_1 = new JButton("+");
					btnNewButton_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							metodo01.FIFO();
						}
					});
					btnNewButton_1.setBounds(200, 135, 50, 23);
					panel_1.add(btnNewButton_1);




				}
			});
			panel_1.add(fifo01);


			//SEGUNDA CHANCE
			JButton segundaChance01 = new JButton("Segunda Chance");
			segundaChance01.setBounds(8, 166, 182, 40);
			segundaChance01.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					metodo01.inicializarMemoria();
					System.out.println("_SEGUNDA CHANCE_");
					JButton btnNewButton_1 = new JButton("+");
					btnNewButton_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							metodo01.segundaChance();
						}
					});
					btnNewButton_1.setBounds(200, 175, 50, 23);
					panel_1.add(btnNewButton_1);
				}
			});
			panel_1.add(segundaChance01);


			//MENOS RECENTEMENTE USADA
			JButton menosRecentementeUsada01 = new JButton("Menos Recentemente Usada");
			menosRecentementeUsada01.setBounds(8, 206, 182, 40);
			menosRecentementeUsada01.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					metodo01.inicializarMemoria();
					System.out.println("_MENOS RECENTEMENTE USADA_");
					JButton btnNewButton_1 = new JButton("+");
					btnNewButton_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							metodo01.menosRecentementeUsada();
						}
					});
					btnNewButton_1.setBounds(200, 215, 50, 23);
					panel_1.add(btnNewButton_1);
				}
			});
			panel_1.add(menosRecentementeUsada01);







			//MÉTODO 02 (ESPERA 1 SEC)
			JPanel panel_2 = new JPanel();
			tabbedPane.addTab("Método 02", null, panel_2, null);

			//ALGORITMO OTIMO
			JButton algoritmoOtimo02 = new JButton("Algoritmo Otimo");
			algoritmoOtimo02.setBounds(8, 11, 182, 40);
			algoritmoOtimo02.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					metodo02.algoritmoOtimo();
				}
			});
			panel_2.setLayout(null);
			panel_2.add(algoritmoOtimo02);


			//SUBSTITUIÇÃO ALEATÓRIA
			JButton aleatorio02 = new JButton("Substituição Aleatoria");
			aleatorio02.setBounds(8, 46, 182, 40);
			aleatorio02.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					metodo02.algoritmoAleatorio();
				}
			});
			panel_2.add(aleatorio02);


			//NÃO USADA RECENTEMENTE
			JButton naoUsadaRecentemente02 = new JButton("Não Usada Recentemente");
			naoUsadaRecentemente02.setBounds(8, 86, 182, 40);
			naoUsadaRecentemente02.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					metodo02.naoUsadaRecentemente();
				}
			});
			panel_2.add(naoUsadaRecentemente02);


			//FIFO
			JButton fifo02 = new JButton("FIFO");
			fifo02.setBounds(8, 126, 182, 40);
			fifo02.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					metodo02.FIFO();
				}
			});
			panel_2.add(fifo02);


			//SEGUNDA CHANCE
			JButton segundaChance02 = new JButton("Segunda Chance");
			segundaChance02.setBounds(8, 166, 182, 40);
			segundaChance02.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					metodo02.segundaChance();
				}
			});
			panel_2.add(segundaChance02);


			//MENOS RECENTEMENTE USADA
			JButton menosRecentementeUsada02 = new JButton("Menos Recentemente Usada");
			menosRecentementeUsada02.setBounds(8, 206, 182, 40);
			menosRecentementeUsada02.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					metodo02.menosRecentementeUsada();
				}
			});
			panel_2.add(menosRecentementeUsada02);




			//MÉTODO 03 (SIMULAÇÃO COMPLETA)
			JPanel panel_3 = new JPanel();
			tabbedPane.addTab("Método 03", null, panel_3, null);

			//ALGORITMO OTIMO
			JButton algoritmoOtimo03 = new JButton("Algoritmo Otimo");
			algoritmoOtimo03.setBounds(8, 11, 182, 40);
			algoritmoOtimo03.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {


					metodo03.algoritmoOtimo();

					String dados = String.valueOf(metodo03.dados);

					btnOtimo = new JLabel(dados);
					btnOtimo.setBounds(327, 11, 331, 235);
					panel_3.add(btnOtimo);


				}
			});
			panel_3.setLayout(null);
			panel_3.add(algoritmoOtimo03);


			//SUBSTITUIÇÃO ALEATÓRIA
			JButton aleatorio03 = new JButton("Substituição Aleatoria");
			aleatorio03.setBounds(8, 46, 182, 40);
			aleatorio03.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {


					metodo03.algoritmoOtimo();
					metodo03.algoritmoAleatorio();

					String dados = String.valueOf(metodo03.dados);

					btnAleatorio = new JLabel(dados);
					btnAleatorio.setBounds(327, 11, 331, 235);
					panel_3.add(btnAleatorio);
				}
			});
			panel_3.add(aleatorio03);


			//NÃO USADA RECENTEMENTE
			JButton naoUsadaRecentemente03 = new JButton("Não Usada Recentemente");
			naoUsadaRecentemente03.setBounds(8, 86, 182, 40);
			naoUsadaRecentemente03.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {


					metodo03.algoritmoOtimo();
					metodo03.naoUsadaRecentemente();

					String dados = String.valueOf(metodo03.dados);

					nUsada = new JLabel(dados);
					nUsada.setBounds(327, 11, 331, 235);
					panel_3.add(nUsada);
				}
			});
			panel_3.add(naoUsadaRecentemente03);


			//FIFO
			JButton fifo03 = new JButton("FIFO");
			fifo03.setBounds(8, 126, 182, 40);
			fifo03.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {


					metodo03.algoritmoOtimo();
					metodo03.FIFO();

					String dados = String.valueOf(metodo03.dados);

					fifo = new JLabel(dados);
					fifo.setBounds(327, 11, 331, 235);
					panel_3.add(fifo);
				}
			});
			panel_3.add(fifo03);


			//SEGUNDA CHANCE
			JButton segundaChance03 = new JButton("Segunda Chance");
			segundaChance03.setBounds(8, 166, 182, 40);
			segundaChance03.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {


					metodo03.algoritmoOtimo();
					metodo03.segundaChance();

					String dados = String.valueOf(metodo03.dados);

					segunda = new JLabel(dados);
					segunda.setBounds(327, 11, 331, 235);
					panel_3.add(segunda);
				}
			});
			panel_3.add(segundaChance03);



			//MENOS RECENTEMENTE USADA
			JButton menosRecentementeUsada03 = new JButton("Menos Recentemente Usada");
			menosRecentementeUsada03.setBounds(8, 206, 182, 40);
			menosRecentementeUsada03.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					metodo03.algoritmoOtimo();
					metodo03.menosRecentementeUsada();

					String dados = String.valueOf(metodo03.dados);

					menosUsada = new JLabel(dados);
					menosUsada.setBounds(327, 11, 331, 235);
					panel_3.add(menosUsada);
				}
			});
			panel_3.add(menosRecentementeUsada03);


			//EXECUTAR TODOS
			JButton executarTodos = new JButton("Executar todos");
			executarTodos.setBounds(8, 246, 182, 40);
			executarTodos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					metodo03.algoritmoOtimo();
					String dados0 = String.valueOf(metodo03.dados);
					btn_1 = new JLabel(dados0);
					btn_1.setBounds(300, 11, 300, 300);
					panel_3.add(btn_1);

					metodo03.algoritmoAleatorio();
					String dados = String.valueOf(metodo03.dados);
					btn_11 = new JLabel(dados);
					btn_11.setBounds(600, 11, 300, 300);
					panel_3.add(btn_11);

					metodo03.naoUsadaRecentemente();
					String dados2 = String.valueOf(metodo03.dados);
					btn_2 = new JLabel(dados2);
					btn_2.setBounds(900, 11, 300, 300);
					panel_3.add(btn_2);

					metodo03.FIFO();
					String dados3 = String.valueOf(metodo03.dados);
					btn_3 = new JLabel(dados3);
					btn_3.setBounds(300, 259, 300, 300);
					panel_3.add(btn_3);

					metodo03.segundaChance();
					String dados4 = String.valueOf(metodo03.dados);
					btn_4 = new JLabel(dados4);
					btn_4.setBounds(600, 259, 300, 300);
					panel_3.add(btn_4);

					metodo03.menosRecentementeUsada();
					String dados5 = String.valueOf(metodo03.dados);
					btn_5 = new JLabel(dados5);
					btn_5.setBounds(900, 259, 300, 300);
					panel_3.add(btn_5);
				}
			});
			panel_3.add(executarTodos);

			JButton excluir = new JButton("x");
			excluir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_3.remove(btnOtimo);
					panel_3.remove(btnAleatorio);
					panel_3.remove(nUsada);
					panel_3.remove(fifo);
					panel_3.remove(segunda);
					panel_3.remove(menosUsada);

					panel_3.remove(btn_1);
					panel_3.remove(btn_11);
					panel_3.remove(btn_2);
					panel_3.remove(fifo);
					panel_3.remove(btn_3);
					panel_3.remove(btn_4);
					panel_3.remove(btn_5);
				}
			});
			excluir.setBounds(47, 312, 103, 31);
			panel_3.add(excluir);

		}catch(Exception e) {}
	}

}