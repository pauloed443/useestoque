package mvc;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class entradaProduto extends JFrame implements ActionListener {
	
	private String descricao = "";
	private String especificacao = "";
	private String preco = "";
	private String uniFiscal = "";
	
	JTextField tfPesq = new JTextField();
	JButton btPesquisar = new JButton("Pesquisar");
	JTable tbProduto = new JTable();
	JLabel lbDesc = new JLabel("Descrição: ");
	JTextField tfDesc = new JTextField();
	JLabel lbEspec = new JLabel("Especificação: ");
	JTextField tfEspec = new JTextField();
	JLabel lbPreco = new JLabel("Preço: ");
	JTextField tfPreco = new JTextField();
	JLabel lbUniFiscal = new JLabel("Unidade Fiscal: ");
	JTextField tfUniFiscal = new JTextField();
	JButton btAtualizar = new JButton("Atualizar");
	JButton btCancelar = new JButton("Cancelar");
	
	entradaProduto() {
		super("Saída de Produto - Use Estoque");
		//Conteiner PRINCIPAL
		Container ctPrincipal = getContentPane();
		ctPrincipal.setLayout(new GridLayout(3, 1));
		//Conteiner que contém campo pesquisa e localizado no PRINCIPAL(1,1)
		Container ctPesquisa = new JPanel();
		ctPesquisa.setLayout(new GridLayout(4,2));
		//Conteiner que contem informações para atualização e localizado no PRINCIPAL(3,1)
		Container ctInfo = new JPanel();
		ctInfo.setLayout(new GridLayout(6,3));
		
		//Adiciona o campo pesquisa no ctPesquisa
		ctPesquisa.add(new JPanel());
		ctPesquisa.add(new JPanel());
		ctPesquisa.add(new JPanel());
		ctPesquisa.add(new JPanel());
		ctPesquisa.add(new JLabel("Produto: "));
		ctPesquisa.add(tfPesq);
		ctPesquisa.add(new JPanel());
		ctPesquisa.add(btPesquisar);
		
		//Adiciona as informações para atualização no ctInfo
		ctInfo.add(lbDesc);
		ctInfo.add(lbEspec);
		ctInfo.add(lbPreco);
		ctInfo.add(tfDesc);
		ctInfo.add(tfEspec);
		ctInfo.add(tfPreco);
		ctInfo.add(lbUniFiscal);
		ctInfo.add(new JPanel());
		ctInfo.add(new JPanel());
		ctInfo.add(tfUniFiscal);
		ctInfo.add(new JPanel());
		ctInfo.add(new JPanel());
		ctInfo.add(new JPanel());
		ctInfo.add(btAtualizar);
		ctInfo.add(btCancelar);
		ctInfo.add(new JPanel());
		ctInfo.add(new JPanel());
		ctInfo.add(new JPanel());
		
		ctPrincipal.add(ctPesquisa);
		//Adiciona a tabela no PRINCIPAL(2,1)
		ctPrincipal.add(tbProduto);
		ctPrincipal.add(ctInfo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
