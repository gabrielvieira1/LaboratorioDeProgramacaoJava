package lista01lab;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// ex2 op = new ex2();
		Scanner scan = new Scanner(System.in);
		double a, b, c = 0, d = 0;
		Ex2registro funcionario[] = new Ex2registro[4];
		double menorPort = Integer.MAX_VALUE, menorRecp = Integer.MAX_VALUE;
		// ENTRADA DE INFORMAÇÕES
		for (int i = 0; i < funcionario.length; i++) {
			funcionario[i] = new Ex2registro();
			System.out.println("Digite o Nome e Sobrenome: ");
			funcionario[i].nomeSobrenome = scan.next();
			System.out.println("Digite a função: ");
			funcionario[i].funcao = scan.next();
			System.out.println("Digite o valor do salario: ");
			funcionario[i].salario = scan.nextDouble();
			System.out.println("Digite o valor do vale-refeição: ");
			funcionario[i].valeRefeicao = scan.nextDouble();
		} // LEITURA DE INFORMAÇOES
		for (int i = 0; i < funcionario.length; i++) {
			System.out.println("Nome e sobrenome: " + funcionario[i].nomeSobrenome + " Função: " + funcionario[i].funcao
					+ " Salario: " + funcionario[i].salario + " Vale-refeição: " + funcionario[i].valeRefeicao + "\n");
			a = funcionario[i].salario;
			b = funcionario[i].salario;
			// COMPARA SE É PORTEIRO
			switch (funcionario[i].funcao) {
			case "Porteiro":
				// COMPARA SE É PORTEIRO E TEM O MENOR SALARIO
				if (funcionario[i].salario < menorPort) {
					menorPort = funcionario[i].salario;
					c = i;
				}
				// CHAMA O METODO DO AUMENTO DE SALARIO
				aumentoPort(a);
				// CHAMA O METODO AUMENTO DE VALE-REFEIÇAO
				aumentoMenor(funcionario[(int) c].valeRefeicao);
				break;
			// COMPARA SE É RECEPCIONISTA
			case "recepcionista":
				// COMPARA SE É RECEPCIONISTA E TEM O MENOR SALARIO
				if (funcionario[i].salario < menorRecp) {
					menorRecp = funcionario[i].salario;
					d = i;
				}
				// CHAMA O METODO DO AUMENTO DE SALARIO
				aumentoRecp(b);
				// CHAMA O METODO AUMENTO DE VALE-REFEIÇAO
				aumentoMenor(funcionario[(int) d].valeRefeicao);
			default:
				break;
			}
		}
	}

	/*
	 * public static void main(String[] args) { Scanner scan = new
	 * Scanner(System.in); double a , b, novoSalario = 0; Ex2registro funcionario[]
	 * = new Ex2registro[4]; // String nomeSobrenome, funcao; // double salario,
	 * valeRefeicao; for (int i = 0; i < funcionario.length; i++) { funcionario[i] =
	 * new Ex2registro(); System.out.println("Digite o Nome e Sobrenome: ");
	 * funcionario[i].nomeSobrenome = scan.next();
	 * System.out.println("Digite a função: "); funcionario[i].funcao = scan.next();
	 * System.out.println("Digite o valor do salario: "); funcionario[i].salario =
	 * scan.nextDouble(); System.out.println("Digite o valor do vale-refeição: ");
	 * funcionario[i].valeRefeicao = scan.nextDouble(); switch
	 * (funcionario[i].funcao) { case "Porteiro": a = funcionario[i].salario;
	 * aumentoSalario(a); break; case "recepcionista": b = funcionario[i].salario;
	 * aumentoSalario(b); default: break; } } for (int i = 0; i <
	 * funcionario.length; i++) { System.out.println("Nome e sobrenome: " +
	 * funcionario[i].nomeSobrenome + " Função: " + funcionario[i].funcao +
	 * " Salario: " + funcionario[i].salario + " Novo Salario: " +
	 * aumentoSalario(novoSalario) + " Vale-refeição: " +
	 * funcionario[i].valeRefeicao + "\n");
	 * 
	 * } }
	 */
	/*
	 * public void aumentoSalario( double salario, String op) { // Ex2registro
	 * cargo[] = new Ex2registro[4]; // double salario1 = salario; double a =
	 * salario; double b = salario; double novoSalario = 0; switch (op) { case
	 * "Porteiro": aumentoPort(a); break; case "recepcionista": aumentoRecp(b);
	 * default: break; }
	 * 
	 * }
	 */
	// CALCULO AUMENTO DE SALARIO DO PORTEIRO
	private static double aumentoPort(double salario) {
		double novoSalario = 0;
		double b = salario;
		novoSalario = (salario + (b * 0.15));
		System.out.println("Novo salario: " + novoSalario);
		return novoSalario;
	} // CALCULO AUMENTO DE SALRIO DE RECEPCIONISTA

	private static double aumentoRecp(double salario) {
		double novoSalario = 0;
		double b = salario;
		novoSalario = (salario + (b * 0.10));
		System.out.println("Novo salario: " + novoSalario);
		return novoSalario;
	} // CALCULO AUMENTO DE VALE-REFEICAO

	private static double aumentoMenor(double salario) {
		double novoSalario = 0;
		double b = salario;
		novoSalario = (salario + (b * 0.20));
		System.out.println("Novo vale refeição: " + novoSalario);
		return novoSalario;
	}
}
