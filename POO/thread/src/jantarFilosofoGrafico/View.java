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
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;
public class View extends JFrame {
	private JPanel contentPane;
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

		//vetor que guarda todos os garfos (botões)
		JButton garfos[] = new JButton[5];
		garfos[0]=garfo0;
		garfos[1]=garfo1;
		garfos[2]=garfo2;
		garfos[3]=garfo3;
		garfos[4]=garfo4;

		//main
		JButton start = new JButton("Start");
		start.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*final long tempoExecucaoStart =  System.nanoTime();
				double tempoExecucao = tempoExecucaoStart/1000000000;
				System.out.println("tempoExecucao "+tempoExecucao);*/
				
				Mesa mesa = new Mesa (garfos);
				new Filosofo("Filosofo0", mesa, 0, filosofo0);
				new Filosofo("Filosofo1", mesa, 1, filosofo1);
				new Filosofo("Filosofo2", mesa, 2, filosofo2);
				new Filosofo("Filosofo3", mesa, 3, filosofo3);
				new Filosofo("Filosofo4", mesa, 4, filosofo4);
				
				/*JButton stopBtn = new JButton("stop");
				stopBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Filosofo.dead();
					}
				});
				stopBtn.setBounds(518, 321, 89, 23);
				contentPane.add(stopBtn);*/
			}
		});
		start.setBounds(26, 307, 89, 37);
		contentPane.add(start);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Jantar dos Filósofos");
		lblNewJgoodiesTitle.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		lblNewJgoodiesTitle.setBackground(Color.YELLOW);
		lblNewJgoodiesTitle.setBounds(26, 11, 113, 14);
		contentPane.add(lblNewJgoodiesTitle);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(671, 96, 319, 136);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Os bot\u00F5es grandes representam os fil\u00F3sofos.");
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("Os menores representam os garfos.");
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("A cor vermelha representa que os garfos n\u00E3o est\u00E3o");
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("sendo usados e que os fil\u00F3sofos est\u00E3o pensando.");
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("A cor verde representa que o garfo est\u00E1 sendo");
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("usado e o fil\u00F3sofoe est\u00E1 comendo");
		panel.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Mesa");
		btnNewButton.setForeground(Color.PINK);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(270, 135, 76, 73);
		contentPane.add(btnNewButton);
		


		
	}
}