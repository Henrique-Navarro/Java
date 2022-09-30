
package simuladorMemoriaCache;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import simuladorMemoriaEx.Cache;
import simuladorMemoriaEx.FileManager;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class View extends JFrame {

	private JPanel contentPane;
	double taxaDireto, taxaAssociativo, taxaAssConj;

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

	//interface
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel msg = new JLabel("Selecione o Mapeamento Desejado:");
		msg.setBounds(67, 41, 250, 45);
		contentPane.add(msg);

		JButton mapDireto = new JButton("Mapeamento Direto");
		mapDireto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileManager fm = new FileManager();
				ArrayList<String> memoriaRam = fm.transformar(fm.stringReader("teste_1.txt"));
				
				String tipoMap = new String("DIRETO");
				FileManager f1 = new FileManager();
				f1.lerConfig("config.txt");
				//Cache c = new Cache(memoriaRam, tipoMap);
			}
		});
		mapDireto.setBounds(33, 97, 221, 60);
		contentPane.add(mapDireto);

		/*JButton mapAssociativo = new JButton("Mapeamento Associativo");
		mapAssociativo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileManager t1 = new FileManager();
				//FileManager t2 = new FileManager();
				ArrayList<String> memoriaRam = t1.lerArquivo(t1.stringReader("teste_1.txt"));
				//t2.lerArquivo(t2.stringReader("teste_2.txt"));
				String tipoMap = new String("ASSOCIATIVO");
				Cache c = new Cache(memoriaRam, tipoMap);
				c.lerConfig("config.txt");
			}
		});
		mapAssociativo.setBounds(33, 181, 221, 60);
		contentPane.add(mapAssociativo);

		JButton mapAssConj = new JButton("Associativo em Conjunto");
		mapAssConj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileManager t1 = new FileManager();
				//FileManager t2 = new FileManager();
				ArrayList<String> memoriaRam=t1.lerArquivo(t1.stringReader("teste_1.txt"));
				//t2.lerArquivo(t2.stringReader("teste_2.txt"));
				String tipoMap = new String("ASSCONJ");
				Cache c = new Cache(memoriaRam, tipoMap);
				c.lerConfig("config.txt");
			}
		});
		mapAssConj.setBounds(33, 279, 221, 60);
		contentPane.add(mapAssConj);*/


	}
}