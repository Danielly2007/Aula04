package aula04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade_.Conta;
import entidade_.ContaCorrente;
import entidade_.ContaPoupanca;

public class Programa {
	
		public static void main(String[] args) {
			Scanner a = new Scanner(System.in);
			List<Conta> lista = new ArrayList<>();
			
		System.out.println("Bem-vindo ao Banco do Brasil" + "\n");
		
		System.out.println("Quantas contas você deseja cadastrar? ");
		int n = a.nextInt();
			
		for(int i = 1 ; i <= n ; i++) {
			System.out.println("\n" + "Digite C para Conta Corrente ou P para Poupança " + "\n");
			String x = a.next();
			
			if(x.equals("C")) {
				System.out.print("Digite o nome da conta: "+ i);
				String nome = a.next();
				
				System.out.print("Digite o Número: ");
				int numero = a.nextInt();
				
				System.out.print("Digite o Saldo: ");
				double saldo = a.nextDouble();
				
				System.out.print("Digite o Limite: ");
				double limite = a.nextDouble();
				
				Conta conta = new ContaCorrente(nome, numero, saldo, limite);
				lista.add(conta);
			}
			else {
				System.out.print("Digite o nome da conta: "+ i);
				String nome = a.next();
				
				System.out.print("Digite o Número: ");
				int numero = a.nextInt();
				
				System.out.print("Digite o Saldo: ");
				double saldo = a.nextDouble();
				
				
				//Conta p = new ContaPoupanca(nome, numero, saldo, limite);
				lista.add(new ContaPoupanca(nome, numero, saldo));
		}
			for(Conta s : lista) {
				System.out.print(s + "\n");
			}
	     }
      }
   }

