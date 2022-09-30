package Pck;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;

public class Andressa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Andressa frame = new Andressa();
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
	public Andressa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 364);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Motivo01");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Porque você é linda!");
			}
		});
		btnNewButton.setBounds(57, 69, 89, 36);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Motivo02");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Porque você é carihosa!");
			}
		});
		btnNewButton_1.setBounds(220, 69, 89, 36);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Motivo03");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Porque você é maravilhosa!");
			}
		});
		btnNewButton_2.setBounds(374, 69, 89, 36);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_1_1 = new JButton("Motivo04");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Porque você é especial para mim!");
			}
		});
		btnNewButton_1_1.setBounds(57, 150, 89, 36);
		contentPane.add(btnNewButton_1_1);

		JButton btnNewButton_1_2 = new JButton("Motivo05");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Porque você é atenciosa!");
			}
		});
		btnNewButton_1_2.setBounds(220, 150, 89, 36);
		contentPane.add(btnNewButton_1_2);

		JButton btnNewButton_1_3 = new JButton("Motivo06");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Porque você cuida de mim!");
			}
		});
		btnNewButton_1_3.setBounds(374, 150, 89, 36);
		contentPane.add(btnNewButton_1_3);

		JButton btnNewButton_1_4 = new JButton("Motivo07");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Porque você me da todo amor do mundo!");
			}
		});
		btnNewButton_1_4.setBounds(57, 240, 89, 36);
		contentPane.add(btnNewButton_1_4);

		JButton btnNewButton_1_5 = new JButton("Motivo08");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Porque você é minha pessoa favorita");
			}
		});
		btnNewButton_1_5.setBounds(220, 240, 89, 36);
		contentPane.add(btnNewButton_1_5);

		JButton btnNewButton_1_6 = new JButton("Motivo09");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("\n\n\n                                                Quero você pra sempre <3\n\n");
					System.out.println("                                                    ¶¶¶¶¶¶      ¶¶¶¶¶¶\r\n"
							+ "                                                  ¶¶¶¶¶¶¶¶¶¶  ¶¶¶¶¶¶¶¶¶¶\r\n"
							+ "                                                 ¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶    ¶¶¶¶\r\n"
							+ "                                                ¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶    ¶¶¶¶\r\n"
							+ "                                                ¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶  ¶¶¶¶¶\r\n"
							+ "                                                ¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶  ¶¶¶¶¶\r\n"
							+ "                                                 ¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\r\n"
							+ "                                                   ¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\r\n"
							+ "                                                     ¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\r\n"
							+ "                                                       ¶¶¶¶¶¶¶¶¶¶¶¶¶\r\n"
							+ "                                                         ¶¶¶¶¶¶¶¶\r\n"
							+ "                                                           ¶¶¶¶\r\n"
							+ "                                                            ¶¶");

				
			}
		});
		btnNewButton_1_6.setBounds(374, 240, 89, 36);
		contentPane.add(btnNewButton_1_6);

		JLabel lblNewLabel = new JLabel("Motivos pelos quis eu amo voc\u00EA:");
		lblNewLabel.setBounds(196, 27, 197, 14);
		contentPane.add(lblNewLabel);
	}
}
