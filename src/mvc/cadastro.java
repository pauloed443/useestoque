package mvc;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import principal.metodos;

public class cadastro extends JFrame implements ActionListener{

	private String codigo;
	private String codigoAux;
	private String descricao = "";
	private String especificacao = "";
	private String preco = "";
	private String uniFiscal = "";
	
	ArrayList<cadastro> listaProd = new ArrayList<cadastro>();
	
	JLabel lbCod = new JLabel("Código: ");
	JTextField tfCod = new JTextField();
	JLabel lbCodAux = new JLabel("Código Auxiliar: ");
	JTextField tfCodAux = new JTextField();
	JLabel lbDesc = new JLabel("Descrição: ");
	JTextField tfDesc = new JTextField();
	JLabel lbEspec = new JLabel("Especificação: ");
	JTextField tfEspec = new JTextField();
	JLabel lbPreco = new JLabel("Preço: ");
	JTextField tfPreco = new JTextField();
	JLabel lbUniFiscal = new JLabel("Unidade Fiscal: ");
	JTextField tfUniFiscal = new JTextField();
	JButton btNovo = new JButton("Novo");
	JButton btSalvar = new JButton("Salvar");
	JButton btCancelar = new JButton("Cancelar");
	
	cadastro(){
		super("UseEstoque - Cadastro de Produtos");
		
		Container ctPrincipal = getContentPane();
		ctPrincipal.setLayout(new BorderLayout());
		
		Container ctSecundario = new JPanel();
		ctSecundario.setLayout(new GridLayout(8,6));
		
		FlowLayout panel = new FlowLayout();
		Container ctP1 = new JPanel();
		Container ctP2 = new JPanel();
		Container ctP3 = new JPanel();
		Container ctP4 = new JPanel();
		Container ctP5 = new JPanel();
		Container ctP6 = new JPanel();
		ctP1.setLayout(panel);
		ctP2.setLayout(panel);
		ctP3.setLayout(panel);
		ctP4.setLayout(panel);
		ctP5.setLayout(panel);
		ctP6.setLayout(panel);
		
		ctSecundario.add(new JPanel());
		ctSecundario.add(new JPanel());
		ctSecundario.add(new JPanel());
		ctSecundario.add(new JPanel());
		ctSecundario.add(new JPanel());
		ctSecundario.add(new JPanel());
		ctSecundario.add(new JPanel());
		ctSecundario.add(lbCod);
		ctSecundario.add(lbCodAux);
		ctSecundario.add(lbDesc);
		ctSecundario.add(lbEspec);
		ctSecundario.add(new JPanel());
		ctSecundario.add(new JPanel());
		ctSecundario.add(tfCod);
		ctSecundario.add(tfCodAux);
		ctSecundario.add(tfDesc);
		ctSecundario.add(tfEspec);
		ctSecundario.add(new JPanel());
		ctSecundario.add(new JPanel());
		ctSecundario.add(lbPreco);
		ctSecundario.add(lbUniFiscal);
		ctSecundario.add(new JPanel());
		ctSecundario.add(new JPanel());
		ctSecundario.add(new JPanel());
		ctSecundario.add(new JPanel());
		ctSecundario.add(tfPreco);
		ctSecundario.add(tfUniFiscal);
		ctSecundario.add(new JPanel());
		ctSecundario.add(new JPanel());
		ctSecundario.add(new JPanel());
		ctSecundario.add(new JPanel());
		ctSecundario.add(new JPanel());
		ctSecundario.add(new JPanel());
		ctSecundario.add(new JPanel());
		ctSecundario.add(new JPanel());
		ctSecundario.add(new JPanel());
		ctSecundario.add(new JPanel());
		ctSecundario.add(new JPanel());
		ctSecundario.add(btNovo);
		ctSecundario.add(btSalvar);
		ctSecundario.add(btCancelar);
		ctSecundario.add(new JPanel());
		ctSecundario.add(new JPanel());
		
		ctP1.add(ctSecundario);
		ctPrincipal.add(BorderLayout.CENTER, ctP1);
		ctPrincipal.add(BorderLayout.SOUTH, new JPanel());
		
		//Evento do botão Novo
		btNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		//Evento do botão Salvar
		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tfCod != null && tfCodAux != null) {
					metodos m = new metodos();
					codigo = tfCod.getText();
					codigoAux = tfCodAux.getText();
					descricao = tfDesc.getText();
					especificacao = tfEspec.getText();
					preco = tfPreco.getText();
					uniFiscal = tfUniFiscal.getText();
					m.setSalvar(codigo, codigoAux, descricao, especificacao, preco, uniFiscal);
				}
			}
		});
		
		//Evento do botão cancelar
		btCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
