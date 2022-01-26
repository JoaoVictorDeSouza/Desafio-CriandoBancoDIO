package br.com.bancoDIO.modelo.Funcionarios;

import br.com.bancoDIO.modelo.Endereco;

public class Balconista extends Funcionario implements Endereco {
	
	public Balconista(String nome, String cpf) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBonificacao() {
		return 200;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString();
	}

}
