package arquivo.service;


import java.time.LocalDate;

import arquivo.conexao.Conexao;
import arquivo.model.Cargo;
import arquivo.model.Funcionario;
import arquivo.model.Sexo;

public class FuncionarioService {
	private Funcionario funcionario;
	
	Conexao conexao = new Conexao();
	
	public Funcionario listagem(int id){
		
		Funcionario funcionario = conexao.getEn().find(Funcionario.class, id);
		return funcionario;
		
	}
	
	public Funcionario cadastrar(String nome,String sobrenome,Cargo cargo,LocalDate data, int registro,double salario, Sexo sexo) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome(nome);
		funcionario.setSobrenome(sobrenome);
		funcionario.setCargo(cargo);
		funcionario.setDataNascimento(data);
		funcionario.setRegistro(registro);
		funcionario.setSalario(salario);
		funcionario.setDataEntrada(LocalDate.now());
		funcionario.setSexo(sexo);
		return funcionario;
	}
	

}
