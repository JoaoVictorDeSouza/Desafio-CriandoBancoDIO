package br.com.bancoDIO.modelo;

/**
 * Classe que representa uma conta corrente e que estende a classe Conta
 * @author Jo�o Victor de Souza
 *
 */
public class ContaCorrente extends Conta {

	/**
	 * Construtor que instancia uma Conta Corrente
	 * @param numero
	 * @param agencia
	 */
	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
	}

	/**
	 * M�todo reescrito que joga uma exce��o caso o valor desejado seja maior que o valor que tem na conta
	 */
	@Override
	public void saca(double valor) throws SaldoInsuficiente{
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}
	
	/**
	 * M�todo reescrito que deposita o valor na conta corrente
	 */
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
	/**
	 * M�todo que passa as informa��es da conta corrente
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Conta Corrente: " + super.toString();
	}
	
}
