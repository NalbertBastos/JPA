package arquivo.aplication;

import java.time.LocalDate;
import java.util.Scanner;

import javax.persistence.*;

import arquivo.conexao.Conexao;
import arquivo.model.Cargo;
import arquivo.model.Sexo;
import arquivo.service.FuncionarioService;
import arquivo.service.VendasService;

public class Main {
	

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Conexao conexao = new Conexao();
		
		// colocar Scanner nos services e tirar do main
		
		
		FuncionarioService fun = new FuncionarioService();		
		System.out.println("Cadastro:\n");
		System.out.println("*******************\n");
		System.out.println("Nome:\n");
		String nome = ler.next();
		System.out.println("Sobrenome:\n");
		String sobrenome = ler.next();
		System.out.println("Cargo:\n");
		Cargo cargo = Cargo.valueOf(ler.next());
		System.out.println("Nascimento:\n");
		LocalDate data = LocalDate.of(ler.nextInt(), ler.nextInt(), ler.nextInt());
		System.out.println("Registro:\n");
		int registro = ler.nextInt();
		System.out.println("Salario:\n");
		double salario = ler.nextDouble();
		System.out.println("sexo:\n");
		Sexo sexo = Sexo.valueOf(ler.next());
		
		conexao.getEn().getTransaction().begin();
		conexao.getEn().persist(fun.cadastrar(nome, sobrenome, cargo, data, registro, salario, sexo));
		conexao.getEn().getTransaction().commit();
		
		VendasService ven = new VendasService();
		System.out.println("Cadastro Vendas:\n");
		System.out.println("*******************");
		System.out.println("Codigo Produto\n");
		int codigoProduto = ler.nextInt();
		System.out.println("Id funcionario\n");
		int id_Funcionario = ler.nextInt();
		System.out.println("Total produto\n");
		int totalProduto = ler.nextInt();
		System.out.println("Valor total\n");
		int valorTotal = ler.nextInt();
		System.out.println("Data venda\n");
		LocalDate dataVenda = LocalDate.of(ler.nextInt(), ler.nextInt(), ler.nextInt());
		
		conexao.getEn().getTransaction().begin();
		conexao.getEn().persist(ven.cadastrarVendas(codigoProduto, id_Funcionario, totalProduto, valorTotal, dataVenda));
		conexao.getEn().getTransaction().commit();
		
		System.out.println("informe id:\n");
		int iden = ler.nextInt();
		fun.listagem(iden);
		System.out.println(fun.listagem(iden));
		
		System.out.println("informe id:\n");
		int idenV = ler.nextInt();
		System.out.println(ven.listagem(idenV));
		
		conexao.getEn().close();
		conexao.getEnf().close();
		

	}
	

}
