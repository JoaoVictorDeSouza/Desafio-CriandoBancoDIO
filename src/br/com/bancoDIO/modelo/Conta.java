package br.com.bancoDIO.modelo;

/**
 * Classe mãe abstrata de uma conta banco que contem saldo, número, agencia e cliente associado
 * @author João Victor de Souza
 */

public abstract class Conta {

	/**
	 * Atributos que uma Conta possui
	 */
	protected double saldo;
	private int numero;
	private int agencia;
	private Cliente cliente;
	
	/**
	 * Construtor para inicializar uma conta.
	 * Tendo a necessidade de passar o número da agencia e o número da conta para identifica-las
	 * Sempre que uma conta for instanciada o valor 200.0 será atribuido ao saldo 
	 * @param numero
	 * @param agencia
	 */
	public Conta(int numero, int agencia) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = 200.0;
	}
	
	/**
	 * Método que devolve o saldo da conta
	 * @return
	 */
	public double getSaldo() {
		return this.saldo;
	}
	/**
	 * Método que devolve o endereço da Classe Cliente e pode acessar os metodos da classe Cliente
	 * @return
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * Recebe a referencia do Cliente instanciado para associar a conta
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	/**
	 * Método que devolve o numero da agencia
	 * @return
	 */
	public int getAgencia() {
		return this.agencia;
	}
	/**
	 * Método que devolve o numero da conta
	 * @return
	 */
	public int getNumero() {
		return this.numero;
	}
	
	public abstract void deposita(double valor);
	
	/**
	 * Método para retirar valores da conta através do parametro
	 * Caso o saldo seja insuficiente, jogará uma exceção
	 * 
	 * @param valor
	 * @throws SaldoInsuficiente
	 */
	public void saca(double valor) throws SaldoInsuficiente{
		if (this.saldo < valor) {
			throw new SaldoInsuficiente("Saldo insuficiente!!!");
		}
		this.saldo -= valor;
	}
	/**
	 * Método para retirar o saldo da conta e enviar para outra conta desejada
	 * Se o valor solicitado for insuficiente, jogará uma exceção
	 * @param valor
	 * @param destino
	 * @throws SaldoInsuficiente
	 */
	public void transferencia(double valor, Conta destino) throws SaldoInsuficiente {
		this.saca(valor);
		destino.deposita(valor);
	}
	
	public String toString() {
		return "Numero: " + this.numero + ", Agencia: " + this.agencia;
	}
}
