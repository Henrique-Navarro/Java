package motoqueiro;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class View extends JFrame {
	private JPanel contentPane;
	Arquivo arq = new Arquivo("teste.txt");

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton algoritmo01 = new JButton("algoritmo01");
		algoritmo01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Motoqueiro motoqueiro01 = new Motoqueiro();
				Motoqueiro motoqueiro02 = new Motoqueiro();
				new Algoritmo01(arq.entregas, motoqueiro01, motoqueiro02);
			}
		});
		algoritmo01.setBounds(10, 29, 110, 36);
		contentPane.add(algoritmo01);

		JButton algoritmo02 = new JButton("algoritmo02");
		algoritmo02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Motoqueiro motoqueiro01 = new Motoqueiro();
				Motoqueiro motoqueiro02 = new Motoqueiro();
				new Algoritmo02(arq.entregas, motoqueiro01, motoqueiro02);
			}
		});
		algoritmo02.setBounds(10, 105, 110, 36);
		contentPane.add(algoritmo02);
	}
}
