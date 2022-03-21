package com.projeto;

import java.util.ArrayList;

import com.projeto.Objetos.Cliente;
import com.projeto.Objetos.Conta;
import com.projeto.Objetos.ContaCorrente;
import com.projeto.Objetos.ContaPoupanca;

public class Index {
	public static void main(String[] args) {
		
		var contas = new ArrayList<Conta>();
		
		var jair = new Cliente(123456789, "Jair", "Rua Sao Flavio 45");
		var maria = new Cliente(789654123, "Maria", "Av José Neves 315");
		
		ContaCorrente corrente = new ContaCorrente(1, 3142, 1517345, jair, 0);
		ContaPoupanca poupanca = new ContaPoupanca(2, 3142, 1273259, maria, 0);
		
		corrente.depositar(1500);
		poupanca.depositar(300);
		
		corrente.sacar(200);
		corrente.transferir(400, poupanca);
		
		contas.add(corrente);
		contas.add(poupanca);
		
		for(Conta conta: contas) {
			conta.imprimirExtrato();
		}
		
	}
}
