package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewLogin {

	private JFrame frame;
	private JTextField txtSenha;
	private JTextField txtLogin;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin window = new ViewLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 481, 394);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(145, 124, 46, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setBounds(145, 214, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		txtSenha = new JTextField();
		txtSenha.setBounds(145, 232, 141, 26);
		frame.getContentPane().add(txtSenha);
		txtSenha.setColumns(10);

		txtLogin = new JTextField();
		txtLogin.setBounds(145, 141, 141, 26);
		frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);

		btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkLogin(txtLogin.getText(), txtSenha.getText())) {
					JOptionPane.showMessageDialog(null, "Bem-vindo ao sistema "+txtLogin.getText()+"!!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Erro ao logar!");
				}
			}
		});
		btnNewButton.setBounds(178, 303, 89, 23);
		frame.getContentPane().add(btnNewButton);

	}
	public boolean checkLogin(String login, String senha) {
		return login.equals("henrique") && senha.equals("123");
	}

}
