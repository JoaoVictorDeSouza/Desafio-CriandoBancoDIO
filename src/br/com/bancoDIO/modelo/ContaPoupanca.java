package br.com.bancoDIO.modelo;

/**
 * Classe que representa uma conta poupança e que estende a classe Conta
 * @author João Victor de Souza
 *
 */
public class ContaPoupanca extends Conta{

	/**
	 * Construtor que cria uma conta poupança passando o numero e a agencia como paramnetros
	 * @param numero
	 * @param agencia
	 */
	public ContaPoupanca(int numero, int agencia) {
		super(numero, agencia);
	}

	/**
	 * Método reescrito para depositar um valor na conta poupança
	 */
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
	/**
	 * metodo reescrito para exibir informações da conta poupança
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conta poupança: " + super.toString();
	}
}
