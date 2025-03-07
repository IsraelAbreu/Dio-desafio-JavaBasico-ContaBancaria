package Default;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		var scan = new Scanner(System.in);
		var conta = new ContaTerminal();		
		
		System.out.println("Olá, seja vem vindo ao agente de criação de conta");
		System.out.println("Agência de criação: " + conta.getAgencia());
		System.out.println("=======================");
		System.out.println("Por gentileza informe o número da conta:");
		var numero = scan.nextInt();
		System.out.println("Informe o nome do cliente:");
		var nome = scan.next();
		System.out.println("Informe o valor de depósito de abertura:");
		var saldo = scan.nextDouble();
		
		if(conta.isValid(numero, nome, saldo)) {
			System.out.println("Dados validados!");
			//Definindo os dados no objeto
			conta.setNumero(numero);
			conta.setNomeCliente(nome);
			conta.setSaldo(saldo);
		} else {
			System.out.println("Verifique novamente os dados preenchidos!");
		}
		
		System.out.println("#### Conta criada com sucesso ####");
		System.out.printf("Número: %s - Agência: %s\n", conta.getNumero(), conta.getAgencia());
		System.out.printf("Cliente: %s - Saldo: R$ %s\n", conta.getNomeCliente(), conta.getSaldo());
		
	}

}
