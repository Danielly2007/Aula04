package entidade_;

import entidade.enums.Cores;

public class ContaCorrente extends Conta{
	
	private double limite;
	
	public ContaCorrente(String nome, int numero, double saldo, double limite) {
		super(nome, numero, saldo);
		this.limite = limite;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente" + mostrar() + "limite=" + limite + "]";
	}



}