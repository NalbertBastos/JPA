package arquivo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUTOS")
public class Produtos {
	@Id
	private int codigo;
	private String nome_produto;
	private String marca_produto;
	private LocalDate data_validade;
	private LocalDate data_fabricacao;
	private int quantidade;
	
	public Produtos() {}

	public Produtos(int codigo, String nome_produto, String marca_produto, LocalDate data_validade,
			LocalDate data_fabricacao, int quantidade) {
		super();
		this.codigo = codigo;
		this.nome_produto = nome_produto;
		this.marca_produto = marca_produto;
		this.data_validade = data_validade;
		this.data_fabricacao = data_fabricacao;
		this.quantidade = quantidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public String getMarca_produto() {
		return marca_produto;
	}

	public void setMarca_produto(String marca_produto) {
		this.marca_produto = marca_produto;
	}

	public LocalDate getData_validade() {
		return data_validade;
	}

	public void setData_validade(LocalDate data_validade) {
		this.data_validade = data_validade;
	}

	public LocalDate getData_fabricacao() {
		return data_fabricacao;
	}

	public void setData_fabricacao(LocalDate data_fabricacao) {
		this.data_fabricacao = data_fabricacao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
