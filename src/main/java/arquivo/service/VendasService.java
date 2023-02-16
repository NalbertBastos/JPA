package arquivo.service;

import java.time.LocalDate;

import arquivo.conexao.Conexao;
import arquivo.model.Vendas;

public class VendasService {
	private Vendas vendas;
	
	Conexao conexao = new Conexao();
	
    public Vendas listagem(int id){
		
		Vendas vendas = conexao.getEn().find(Vendas.class, id);
		return vendas;
		
	}
    
    public Vendas cadastrarVendas(int codigoProduto,int id_Funcionario,int totalProduto,double valorTotal,LocalDate dataVenda) {
    	Vendas vendas = new Vendas();
    	
    	vendas.setCodigoProduto(codigoProduto);
    	vendas.setId_Funcionario(id_Funcionario);
    	vendas.setTotalProduto(totalProduto);
    	vendas.setValorTotal(valorTotal);
    	vendas.setDataVenda(dataVenda);
    	
    	return vendas;
    	
    }
	

}
