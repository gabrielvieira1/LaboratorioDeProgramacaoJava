package lista03lab;

import java.text.ParseException;
import java.util.Scanner;

public class CadastroCompleto {
	private Scanner scan;

	public void cadastroCompleto() throws ParseException {
		Contato c = new Contato();
		scan = new Scanner(System.in);
		// utils
		Utils cpf = new Utils();
		Utils celular = new Utils();
		Utils cep = new Utils();
		System.out.println("-------------------------------------------");
		System.out.println("Você escolheu cadastro completo!");
		System.out.println("Insira as informações do seu novo contato!");
		System.out.println("Nome: ");
		c.setNome(scan.next());

		System.out.println("Idade: ");
		c.setIdade(scan.nextInt());

		System.out.println("Sexo: ");
		c.setSexo(scan.next().charAt(0));

		System.out.println("Número do celular: ");
		c.setCelular(scan.next());

		System.out.println("Email: ");
		c.setEmail(scan.next());

		System.out.println("CEP: ");
		c.setCep(scan.next());

		System.out.println("CPF: ");
		c.setCpf(scan.next());

		System.out.println("----------------------------------");
		System.out.println("Dados do novo contato: ");
		System.out.println("Nome: " + c.getNome());
		System.out.println("CPF: " + Utils.formatarCPF(c.getCpf()));
		System.out.println("Idade: " + c.getIdade());
		System.out.println("Sexo: " + c.getSexo());
		System.out.println("Número: " + celular.formatarCelular(c.getCelular()));
		System.out.println("CEP: " + cep.formatarCEP(c.getCep()));
		System.out.println("Email: " + c.getEmail());

	}
}