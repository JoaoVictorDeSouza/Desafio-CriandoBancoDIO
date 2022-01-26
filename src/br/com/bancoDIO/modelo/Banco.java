package br.com.bancoDIO.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.bancoDIO.modelo.Funcionarios.Funcionario;

/**
 * Classe que representa um Banco e implementa a interface Endereco para indicar sua localização
 * @author João Victor de Souza
 *
 */
public class Banco implements Endereco{

	private List<Conta> contas = new ArrayList<>();
	private List<Funcionario> funcionarios = new ArrayList<>();
	private String rua;
	private Integer numero;
	private String bairro;
	
	public List<Conta> getContas() {
		return contas;
	}

	/**
	 * Método que adiciona uma conta instanciada a lista de Contas 
	 * @param conta
	 */
	public void addContas(Conta conta){
		this.contas.add(conta); 
	}
	
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	/**
	 * Método que adiciona um Funcionario instanciado a lista de Funcionarios
	 * @param funcionario
	 */
	public void addFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	
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
		return "Banco Dio, localizado no bairro " + this.bairro + " na rua " + this.rua + " numero " + this.numero;
	}
}
