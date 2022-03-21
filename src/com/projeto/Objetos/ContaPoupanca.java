package com.projeto.Objetos;

public class ContaPoupanca extends Conta{
	private static final double JUROS = 0.005;
	
	public ContaPoupanca(int id, int agencia, int numero, Cliente titular, double saldo) {
		super(id, agencia, numero, titular, saldo);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("*** Extrato da sua Poupança ***");
		super.informacaoDaConta();
	}
	
	public void render() {
		super.saldo *= (1 + JUROS);
	}

}
