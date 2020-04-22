package lista03lab;
import java.util.Scanner;

public class CadastroSimples {

	private Scanner scan;

	public void Simples() {
		scan = new Scanner(System.in);
		Contato c = new Contato();

		System.out.println("----------------------------------");
		System.out.println("Você escolheu contato simples!");
		System.out.println("Nome: ");
		c.setNome(scan.next());
		
		System.out.println("Contato cadastrado com sucesso! ");
		System.out.println("-----------------------------------");
		System.out.println("Dados do novo contato: ");
		System.out.println("Nome: " + c.getNome());
	}
}
