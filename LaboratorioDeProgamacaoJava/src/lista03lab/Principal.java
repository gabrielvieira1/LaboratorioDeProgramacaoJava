package lista03lab;

import java.text.ParseException;
import java.util.Scanner;

public class Principal {
	private static Scanner scan;

	public static void main(String[] args) throws ParseException {
		// Objetos
		Usuario u = new Usuario();
		Contato c = new Contato();
		Utils cpf = new Utils();

		int qtd;
		scan = new Scanner(System.in);

		System.out.println("Informe seu nome: ");
		u.setNome(scan.next());

		System.out.println("Informe seu CPF: ");
		u.setCpf(scan.next());

		System.out.println("Informe sua idade: ");
		u.setIdade(scan.nextInt());

		System.out.println("Agenda de " + u.getNome());
		System.out.println("---------------------------------");
		System.out.println("Dados do Usuário: ");
		System.out.println("Nome: " + u.getNome());
		System.out.println("CPF: " + Utils.formatarCPF(u.getCpf()));
		System.out.println("Idade: " + u.getIdade());

		System.out.println("Informe a quantidade de contatos que deseja cadastrar: ");
		qtd = scan.nextInt();

		for (int i = 0; i < qtd; i++) {
			System.out.println("---------------------------------");
			System.out.println("Escolha a ação que deseja realizar: ");
			System.out.println("1 - Cadastro simples.");
			System.out.println("2 - Cadastro completo.");
			int escolha = scan.nextInt();

			switch (escolha) {
			case 1:
				CadastroSimples s = new CadastroSimples();
				s.Simples();
				break;
			case 2:
				CadastroCompleto cc = new CadastroCompleto();
				cc.cadastroCompleto();
				break;
			default:
				System.out.println("Não é uma opção de cadastro!!!");
			}
			System.out.println("Programa finalizado!");
		}
	}
}