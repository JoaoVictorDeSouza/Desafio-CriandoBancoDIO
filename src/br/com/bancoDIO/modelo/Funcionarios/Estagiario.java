package br.com.bancoDIO.modelo.Funcionarios;

public class Estagiario extends Funcionario {

	public Estagiario(String nome, String cpf) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Bonificação referente ao cargo de estagiario
	 */
	@Override
	public double getBonificacao() {
		return 50;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
