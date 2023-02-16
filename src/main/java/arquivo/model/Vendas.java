package arquivo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="VENDAS")
public class Vendas {
	@Id
	@GeneratedValue
	private int id;
	@JoinColumn(name="codigo_Produto")
	private int codigoProduto;
	@JoinColumn(name="ID_FUNCIONARIO")
	private int id_Funcionario;
	private int totalProduto;
	private double valorTotal;
	private LocalDate dataVenda;
	
	public Vendas(int codigoProduto,int id_Funcionario,int totalProduto,double valorTotal,LocalDate dataVenda) {
		super();
		this.codigoProduto = codigoProduto;
		this.id_Funcionario = id_Funcionario;
		this.totalProduto = totalProduto;
		this.valorTotal = valorTotal;
		this.dataVenda = dataVenda;
		
	}
	
	public Vendas() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public int getId_Funcionario() {
		return id_Funcionario;
	}

	public void setId_Funcionario(int id_Funcionario) {
		this.id_Funcionario = id_Funcionario;
	}

	public int getTotalProduto() {
		return totalProduto;
	}

	public void setTotalProduto(int totalProduto) {
		this.totalProduto = totalProduto;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public LocalDate getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDate dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	@Override
	public String toString() {
		
		return "**Codigo produto:**\n" + codigoProduto + "\n**Registro Vendedor:**\n" + id_Funcionario 
				+ "\n**Total Produtos:**\n"+ totalProduto + "\n**Valor Total:**\n "+ valorTotal + "\n**Data Venda:**\n"  + dataVenda;
	}
	
	
	
}
