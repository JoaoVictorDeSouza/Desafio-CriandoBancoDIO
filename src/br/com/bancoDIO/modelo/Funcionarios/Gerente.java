package br.com.bancoDIO.modelo.Funcionarios;

public class Gerente extends Funcionario {
	
	
	public Gerente(String nome, String cpf) {
		super(nome, cpf);
	}

	/**
	 * Bonificação referente ao cargo de gerente
	 */
	@Override
	public double getBonificacao() {
		return 800;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
