package br.com.bancoDIO.modelo;

/**
 * Classe que representa um cliente do banco e implementa a interface Endereco para indicar onde mora
 * @author João Victor de Souza
 *
 */
public class Cliente implements Endereco{

	/**
	 * Atributos que um Cliente possui
	 */
	private String nome;
	private static String cpf;
	private String rua;
	private Integer numero;
	private String bairro;
	private String rg;
	
	
	/**
	 * Construtor que recebe parametros com os dados necessarios para criar um cliente
	 * @param nome
	 * @param cpf
	 * @param endereco
	 * @param rg
	 */
	public Cliente(String nome, String cpf, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getRg() {
		return rg;
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
		return "Nome: " + this.nome + " RG: " + this.rg + " CPF: " + this.cpf;
	}
}
