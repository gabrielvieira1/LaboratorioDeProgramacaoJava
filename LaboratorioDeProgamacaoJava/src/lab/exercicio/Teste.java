package lab.exercicio;

import java.util.Scanner;

import lab.exercicio.BancoNovaRoma;
import lab.exercicio.Cliente;
import lab.exercicio.ContaAbstrata;
import lab.exercicio.IBancogeral;

public class Teste {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		IBancogeral banco = new BancoNovaRoma();
		Cliente c = new Cliente();
		double saldoInicial;
		String tipo, nome, cpf, numeroConta;

		System.out.println("Informe seu nome");
		nome = scan.next();
		c.setNome(nome);

		System.out.println("Informe seu CPF");
		cpf = scan.next();
		c.setCpf(cpf);

		System.out.println("Informe seu numero de conta");
		numeroConta = scan.next();

		System.out.println("Informe seu saldo inicial");
		saldoInicial = scan.nextDouble();

		System.out.println("Informe seu tipo de conta(Poupanca ou Conta Corrente)");
		tipo = scan.next();

		ContaAbstrata c1 = banco.abrirConta(c, numeroConta, saldoInicial, tipo);

		System.out.println(c.getCpf());
		System.out.println(c1.getCliente().getNome());

	}

}
