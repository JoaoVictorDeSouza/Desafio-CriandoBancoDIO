package br.com.bancoDIO.modelo;

/**
 * Classe que representa uma conta poupan�a e que estende a classe Conta
 * @author Jo�o Victor de Souza
 *
 */
public class ContaPoupanca extends Conta{

	/**
	 * Construtor que cria uma conta poupan�a passando o numero e a agencia como paramnetros
	 * @param numero
	 * @param agencia
	 */
	public ContaPoupanca(int numero, int agencia) {
		super(numero, agencia);
	}

	/**
	 * M�todo reescrito para depositar um valor na conta poupan�a
	 */
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
	/**
	 * metodo reescrito para exibir informa��es da conta poupan�a
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conta poupan�a: " + super.toString();
	}
}
