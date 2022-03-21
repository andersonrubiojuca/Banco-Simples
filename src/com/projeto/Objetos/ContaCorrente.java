package com.projeto.Objetos;

public class ContaCorrente extends Conta{
	private static final int TAXA = 30;
	
	public ContaCorrente(int id, int agencia, int numero, Cliente titular, double saldo) {
		super(id, agencia, numero, titular, saldo);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("*** Extrato da Conta Corrente ***");
		super.informacaoDaConta();
	}
	
	public void taxa() {
		super.saldo -= TAXA;
	}

}
