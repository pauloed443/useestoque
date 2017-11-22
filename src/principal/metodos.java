package principal;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import mvc.cadastro;

public class metodos {
	
	private String codigo;
	private String codigoAux;
	private String descricao;
	private String especificacao; 
	private String preco; 
	private String uniFiscal;
	String listaProdutos = "";
	
	public void setSalvar(String codigo, String codigoAux, String descricao, String especificacao, String preco, String uniFiscal) {
		
		//ArrayList<cadastro> listaProdutos = new ArrayList<cadastro>();
		setCodigo(codigo);
		setCodigoAux(codigoAux);
		setDescricao(descricao);
		setEspecificacao(especificacao);
		setPreco(preco);
		setUniFiscal(uniFiscal);
		
		//Cria caminho e armazena numa string os dados
		Path caminho = Paths.get("E:\\Eclipse-workspace\\UseEstoque\\src\\Produtos.txt");
		listaProdutos = getProdutos()+"\n" + getCodigo()+", " + getCodigoAux()+", " + getDescricao()+", "
				+ getEspecificacao()+", " + getPreco()+", " + getUniFiscal();
		byte[] listaProdutosByte = listaProdutos.getBytes();
		
		//grava os arquivos no txt
		try {
			Files.write(caminho, listaProdutosByte);
			JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!");
		}
		catch(Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro ao gravar!");
		}
	}
	
	//Pega os arquivos no txt
	public String getProdutos() {
		Path caminho = Paths.get("E:\\Eclipse-workspace\\UseEstoque\\src\\Produtos.txt");
		String listaProduto = "";
		try {
			byte[] listaProdutosByte = Files.readAllBytes(caminho);
			listaProduto = new String(listaProdutosByte);
			return listaProduto;
		}
		catch(Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro ao ler!");
		}
		return listaProduto;
	}
	
	
//Metodos getts e setts (descrição, especificação, preco, unifiscal
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCodigoAux() {
		return codigoAux;
	}
	public void setCodigoAux(String codigoAux) {
		this.codigoAux = codigoAux;
	}
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getUniFiscal() {
		return uniFiscal;
	}

	public void setUniFiscal(String uniFiscal) {
		this.uniFiscal = uniFiscal;
	}
	
}
