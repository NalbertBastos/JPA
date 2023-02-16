package arquivo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="FUNCIONARIO")
public class Funcionario {
	
	@Id
	@GeneratedValue
	private int id;
	private int registro;
	private double salario;
	private Cargo cargo;
	private LocalDate dataEntrada;
	private String nome; 
	private String sobrenome;
	private LocalDate dataNascimento; 
	private Sexo sexo;
	
	public Funcionario(String nome,String sobrenome,LocalDate dataNascimento,Sexo sexo, int registro,
			double salario,Cargo cargo, LocalDate dataEntrada) {
		super();
		this.registro = registro;
		this.salario = salario;
		this.cargo = cargo;
		this.dataEntrada = dataEntrada;
	}
	
	
	public Funcionario() {}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}


	@Override
	public String toString() {
		
		return "**Funcionario:**\n"+ nome + " " + sobrenome + "\n**Data Nascimento:**\n"+ dataNascimento + "\n **Sexo:**" + sexo
			 +"\n**Registro:**\n"+ registro 
				+"\n**Cargo**\n" + cargo + "\n**Data Entrada:**\n" + dataEntrada + "\n**Salário:**\n" + salario;
	}

}
