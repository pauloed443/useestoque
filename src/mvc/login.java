package mvc;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class login extends JFrame implements ActionListener {

	private String usuario = "";
	private String senha = "";

	public JLabel lbLogin = new JLabel("LOGIN");
	public JLabel lbUsuario = new JLabel("Usuario: ");
	public JLabel lbSenha = new JLabel("Senha: ");
	public JTextField tfUsuario = new JTextField();
	public JPasswordField pfSenha = new JPasswordField();
	public JButton jbEntrar = new JButton("Entrar");
	public JButton jbSair = new JButton("Sair");

	login() {

		super("Login - UseEstoque");

		Container ctPrincipal = getContentPane();
		ctPrincipal.setLayout(new GridLayout(2, 1));

		Container ctSecundario = new JPanel();
		ctSecundario.setLayout(new FlowLayout());

		// onde ficará todas as informações do login
		Container ctLogin = new JPanel();
		// cria a grid das informações do login
		ctLogin.setLayout(new GridLayout(5, 5));

		// ctLogin.add(BorderLayout.LINE_START, jl_login);
		ctLogin.add(new JPanel());
		ctLogin.add(new JPanel());
		ctLogin.add(lbUsuario);
		ctLogin.add(tfUsuario);
		ctLogin.add(lbSenha);
		ctLogin.add(pfSenha);
		ctLogin.add(new JPanel());
		ctLogin.add(new JPanel());
		ctLogin.add(jbEntrar);
		ctLogin.add(jbSair);

		// Evento clique do botão entrar
		jbEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Cria e chama o Menu
				menu m = new menu();
				m.setDefaultCloseOperation(HIDE_ON_CLOSE);
				m.setSize(700, 600);
				m.setLocationRelativeTo(null);
				m.setVisible(true);
				m.setExtendedState(MAXIMIZED_BOTH);

			}
		});
		// Evento clique do botão sair
		jbSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		// Imagem Login
		JLabel imgLogin = new JLabel();
		imgLogin.setIcon(new ImageIcon("G:\\Eclipse-workspace\\UseEstoque\\src\\mvc\\Login.png"));

		// Adiciona o login no centro
		ctPrincipal.add(imgLogin);
		// container principal recebe o conteiner Login.
		ctPrincipal.add(ctSecundario);

		ctSecundario.add(ctLogin); // coloca o login no borderlayout

	}

	public void actionPerformed(ActionEvent event) {

	}

}
