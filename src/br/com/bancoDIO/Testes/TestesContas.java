package br.com.bancoDIO.Testes;

import br.com.bancoDIO.modelo.Banco;
import br.com.bancoDIO.modelo.Cliente;
import br.com.bancoDIO.modelo.Conta;
import br.com.bancoDIO.modelo.ContaCorrente;
import br.com.bancoDIO.modelo.ContaPoupanca;
import br.com.bancoDIO.modelo.SaldoInsuficiente;

public class TestesContas {

	public static void main(String[] args) throws SaldoInsuficiente {
		
		//Instanciando a classe Banco
		Banco banco = new Banco();
		
		//Instanciando as classes Clientes e as classes Contas
		Cliente cliente1 = new Cliente("Joao", "222.222.222-22", "33.333.333-33");
		Cliente cliente2 = new Cliente("Ana", "111.111.111-11", "44.444.444-44");
		Conta contaCorrente = new ContaCorrente(21345, 13);
		Conta contaPoupanca = new ContaPoupanca(12345, 12);
		
		//Atribuindo as contas instanciada ao Banco
		banco.addContas(contaPoupanca);
		banco.addContas(contaCorrente);
		
		//Exibindo a conta na posição 1
		System.out.println(banco.getContas().get(1));
		
		//Atribuindo os clientes as contas
		contaCorrente.setCliente(cliente1);
		contaPoupanca.setCliente(cliente2);
		
		
		//Exibindo o valor da conta corrente antes da transferencia
		System.out.println(contaCorrente.getSaldo());
		
		//Testando a tranferencia de valores entre contas
		contaCorrente.transferencia(150.0, contaPoupanca);

		//Exibindo o valor da conta corrente e da conta poupanca depois da tranferecia
		System.out.println(contaCorrente.getSaldo());
		System.out.println(contaPoupanca.getSaldo());
		
		System.out.println(contaPoupanca.getCliente());
		
	}

}
