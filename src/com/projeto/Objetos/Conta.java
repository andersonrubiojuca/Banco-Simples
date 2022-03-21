package com.projeto.Objetos;

public abstract class Conta {
	
	protected int Id;
	protected int agencia;
	protected int numero;
	protected Cliente titular;
	protected double saldo;
	
	/**
	 * normalmente se cria sempre um construct vazio para algum framework
	 */
	public Conta(){}
	
	public Conta(int id, int agencia, int numero, Cliente titular, double saldo) {
		super();
		Id = id;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	// vou deixar aqui já que não pretendo criar aquelas interfaces
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void transferir(double valor, Conta destino) {
		this.sacar(valor);
		destino.depositar(valor);
	}
	
	public void informacaoDaConta() {
		System.out.println("Títular: " + titular.getNome());
		System.out.println("Agência: " + this.agencia);
		System.out.println("Número: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
	}
	
	public abstract void imprimirExtrato();
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		System.out.println("Seu saldo é: " + saldo);
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
