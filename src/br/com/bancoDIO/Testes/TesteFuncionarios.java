package br.com.bancoDIO.Testes;

import br.com.bancoDIO.modelo.Banco;
import br.com.bancoDIO.modelo.Funcionarios.Balconista;
import br.com.bancoDIO.modelo.Funcionarios.DevSenior;
import br.com.bancoDIO.modelo.Funcionarios.Estagiario;
import br.com.bancoDIO.modelo.Funcionarios.Funcionario;
import br.com.bancoDIO.modelo.Funcionarios.Gerente;

public class TesteFuncionarios {

	public static void main(String[] args) {

		// Instanciando os Funcionarios
		Funcionario gerente = new Gerente("Samuel", "111.111.111-11");
		Funcionario dev = new DevSenior("Rafael", "444.444.444-44");
		Funcionario balconista = new Balconista("Paulo", "555.555.555-55");
		Funcionario estagiario = new Estagiario("Fernando", "222.222.222-22");

		// Instanciando o banco e atribuindo os Funcionarios ao banco com List
		Banco banco = new Banco();
		banco.addFuncionario(gerente);
		banco.addFuncionario(dev);
		banco.addFuncionario(balconista);
		banco.addFuncionario(estagiario);

		// Exibindo o Funcionario na posição 0
		System.out.println(banco.getFuncionarios().get(0));
		// Exibindo o Funcionario na posição 1
		System.out.println(banco.getFuncionarios().get(1));
		// Exibindo o Funcionario na posição 2
		System.out.println(banco.getFuncionarios().get(2));
		// Exibindo o Funcionario na posição 3
		System.out.println(banco.getFuncionarios().get(3));
	}

}
