package mvc;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTable;

import principal.metodos;

public class menu extends JFrame implements ActionListener {

	menu() {
		super("Menu - Use Estoque");

		Container ctPrincipal = getContentPane();
		ctPrincipal.setLayout(new BorderLayout());

		JMenuBar menuBar = new JMenuBar();
		JMenu menuArquivo = new JMenu("Arquivo");
		menuBar.add(menuArquivo);

		// Item Cadastro do menu Arquivo
		JMenuItem itemCadastro = new JMenuItem("Cadastro Produto");
		itemCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastro cad = new cadastro();
				cad.setDefaultCloseOperation(HIDE_ON_CLOSE);
				cad.setSize(700, 600);
				cad.setVisible(true);
				cad.setLocationRelativeTo(null);
				// cad.setExtendedState(MAXIMIZED_BOTH);
			}
		});

		// Item Pesquisa do menu Arquivo
		JMenuItem itemPesquisa = new JMenuItem("Pesquisar Produto");
		itemPesquisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pesquisa pesq = new pesquisa();
				pesq.setDefaultCloseOperation(HIDE_ON_CLOSE);
				pesq.setSize(700, 600);
				pesq.setLocationRelativeTo(null);
				pesq.setVisible(true);
				pesq.setExtendedState(MAXIMIZED_BOTH);
			}
		});

		// Item de Entrada de Produto do menu Arquivo
		JMenuItem itemEntrada = new JMenuItem("Entrada");
		itemEntrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entradaProduto entradaProd = new entradaProduto();
				entradaProd.setDefaultCloseOperation(HIDE_ON_CLOSE);
				entradaProd.setSize(700, 600);
				entradaProd.setLocationRelativeTo(null);
				entradaProd.setVisible(true);
				// entradaProd.setExtendedState(MAXIMIZED_BOTH);
			}
		});
		// Item novo abaixo

		menuArquivo.add(itemCadastro);
		menuArquivo.add(itemPesquisa);
		menuArquivo.add(itemEntrada);
		ctPrincipal.add(BorderLayout.NORTH, menuBar);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
}
