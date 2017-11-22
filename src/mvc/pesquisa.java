package mvc;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import principal.metodos;

public class pesquisa extends JFrame implements ActionListener {
	
	JTextField tfCampoPesquisa;
	JButton btPesquisar;
	JTable tbProduto;
	JButton btNovo;
	JButton btEditar;
	
	metodos m = new metodos();
	final String colunas[] = {"Código: ","Código Auxiliar: ", "Descrição: ", "Especificação: ",
			"Preço: ", "Unidade Fical: "};
	final String linhas[] = {m.getProdutos()};
	
	pesquisa(){
		super("Pesquisar - Use Estoque");
		
		tfCampoPesquisa = new JTextField();
		btPesquisar = new JButton("Pesquisar");
		tbProduto = new JTable();
		tbProduto.setPreferredScrollableViewportSize(new Dimension(300,200));
		tbProduto.setFillsViewportHeight(true);
		btNovo = new JButton("Novo");
		btEditar = new JButton("Editar");
		
		//Conteiner 1 - principal
		Container ctPrincipal = getContentPane();
		ctPrincipal.setLayout(new BorderLayout());
		//Conteiner 2 - que se localiza no sul do PRINCIPAL
		Container ctBotoes = new JPanel();
		ctBotoes.setLayout(new GridLayout(1,6));
		//Conteiner 3 - que se localiza no Norte do PRINCIPAL
		Container ctPesquisa = new JPanel();
		ctPesquisa.setLayout(new GridLayout(1,5));
		
		ctPesquisa.add(new JPanel());
		ctPesquisa.add(new JPanel());
		ctPesquisa.add(tfCampoPesquisa);
		ctPesquisa.add(btPesquisar);
		ctPesquisa.add(new JPanel());
		ctPrincipal.add(BorderLayout.NORTH, ctPesquisa);
		ctPrincipal.add(BorderLayout.CENTER, tbProduto);
		ctBotoes.add(new JPanel());
		ctBotoes.add(new JPanel());
		ctBotoes.add(new JPanel());
		ctBotoes.add(btNovo);
		ctBotoes.add(btEditar);
		ctBotoes.add(new JPanel());
		ctPrincipal.add(BorderLayout.SOUTH, ctBotoes);
		
		//Evento do botão NOVO
		btNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		//Evento do botão EDITAR
		btEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
			}
		});
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
