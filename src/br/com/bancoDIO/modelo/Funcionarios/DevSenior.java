package br.com.bancoDIO.modelo.Funcionarios;

import br.com.bancoDIO.modelo.Endereco;

public class DevSenior extends Funcionario implements Endereco{

	
	public DevSenior(String nome, String cpf) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Bonificação referente ao cargo de Desenvolvedor Senior
	 */
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 1000;
	}
	
	
	@Override
	public String toString() {
		return super.toString();
	}

}
