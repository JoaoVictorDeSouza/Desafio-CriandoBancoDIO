package br.com.bancoDIO.modelo;

public class SaldoInsuficiente extends Exception {
	
	public SaldoInsuficiente(String msg) {
		super(msg);
	}
}
