package jantarFilosofoGrafico;

import java.awt.BorderLayout;
import jantarFilosofoGrafico.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
public class View extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		//botões filósofos
		JButton filosofo0 = new JButton("filosofo0");
		filosofo0.setBounds(247, 11, 89, 23);
		contentPane.add(filosofo0);

		JButton filosofo1 = new JButton("filosofo1");
		filosofo1.setBounds(389, 84, 89, 23);
		contentPane.add(filosofo1);

		JButton filosofo2 = new JButton("filosofo2");
		filosofo2.setBounds(362, 193, 89, 23);
		contentPane.add(filosofo2);

		JButton filosofo3 = new JButton("filosofo3");
		filosofo3.setBounds(174, 193, 89, 23);
		contentPane.add(filosofo3);

		JButton filosofo4 = new JButton("filosofo4");
		filosofo4.setBounds(108, 84, 89, 23);
		contentPane.add(filosofo4);


		//botões garfos
		JButton garfo0 = new JButton("0");
		garfo0.setBounds(362, 23, 41, 37);
		garfo0.setBackground(Color.white);
		contentPane.add(garfo0);

		JButton garfo1 = new JButton("1");
		garfo1.setBounds(389, 145, 44, 37);
		garfo1.setBackground(Color.white);
		contentPane.add(garfo1);

		JButton garfo2 = new JButton("2");
		garfo2.setBounds(293, 212, 44, 37);
		garfo2.setBackground(Color.white);
		contentPane.add(garfo2);

		JButton garfo3 = new JButton("3");
		garfo3.setBounds(148, 131, 49, 37);
		garfo3.setBackground(Color.white);
		contentPane.add(garfo3);

		JButton garfo4 = new JButton("4");
		garfo4.setBounds(188, 23, 41, 37);
		garfo4.setBackground(Color.white);
		contentPane.add(garfo4);

		//vetor que guarda todos os filosofos (botões)
		ArrayList<JButton> filosofos = new ArrayList<JButton>();
		filosofos.add(filosofo0);
		filosofos.add(filosofo1);
		filosofos.add(filosofo2);
		filosofos.add(filosofo3);
		filosofos.add(filosofo4);

		//vetor que guarda todos os garfos (botões)
		JButton garfos[] = new JButton[5];
		garfos[0]=garfo0;
		garfos[1]=garfo1;
		garfos[2]=garfo2;
		garfos[3]=garfo3;
		garfos[4]=garfo4;

		//main
		JButton start = new JButton("Start");
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Mesa mesa = new Mesa (garfos);

				//cria 5 thread (filósofos)
				/*for (int filosofo = 0; filosofo < 5; filosofo++)
				{
					new Filosofo("Filosofo_" + filosofo, mesa, filosofo, filosofo0);
				}*/
				new Filosofo("Filosofo0", mesa, 0, filosofo0);
				new Filosofo("Filosofo1", mesa, 1, filosofo1);
				new Filosofo("Filosofo2", mesa, 2, filosofo2);
				new Filosofo("Filosofo3", mesa, 3, filosofo3);
				new Filosofo("Filosofo4", mesa, 4, filosofo4);
			}
		});
		start.setBounds(2, 321, 89, 23);
		contentPane.add(start);

		JButton stop = new JButton("stop");
		stop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//metodo stop
			}
		});
		stop.setBounds(518, 321, 89, 23);
		contentPane.add(stop);
	}
}
