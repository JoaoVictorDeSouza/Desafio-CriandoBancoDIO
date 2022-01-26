package br.com.bancoDIO.modelo.Funcionarios;

import br.com.bancoDIO.modelo.Endereco;

/**
 * Classe abstrata que representa um funcionario
 * @author João Victor de Souza
 *
 */
public abstract class Funcionario implements Endereco{

	/**
	 * Atributos de um funcionario
	 */
	private String nome;
	private double salario;
	private static String cpf;
	private String rua;
	private Integer numero;
	private String bairro;
	
	
	
	public Funcionario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario + getBonificacao();
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}
	
	public abstract double getBonificacao();

	@Override
	public String getRua() {
		// TODO Auto-generated method stub
		return this.rua;
	}

	@Override
	public void setRua(String rua) {
		this.rua = rua;
	}

	@Override
	public Integer getNumero() {
		// TODO Auto-generated method stub
		return this.numero;
	}

	@Override
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Override
	public String getBairro() {
		return this.bairro;
	}

	@Override
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + this.nome + " Salario: " + this.getSalario();
	}
}
