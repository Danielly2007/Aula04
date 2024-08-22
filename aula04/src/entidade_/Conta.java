package entidade_;

import entidade.enums.Cores;

public class Conta {
   
	private String nome;
	private int numero;
	private double saldo;
	private Cores cor;
	
	@Override
	public String toString() {
		return "Conta [nome = " + nome + ", numero = " + numero + ", saldo = " + saldo ;
	}
	public Conta(String nome, int numero, double saldo) {
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;

		
	}
	public void sacar(double saque) {
		saldo = saldo - saque;
	}
	public void depositar(double deposito) {
		saldo = saldo + deposito;
	}
	public String mostrar() {
	return "nome = " + nome + ", numero = " + numero + ", saldo = " + saldo;
	}
	public String getNome() {
		return nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
