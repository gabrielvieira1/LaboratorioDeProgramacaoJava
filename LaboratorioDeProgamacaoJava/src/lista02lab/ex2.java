package lista02lab;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String opcao = null;
		int x , y , z;
	/*	int qtdUsuarios = 0;
		System.out.println("Digite a quantidade de usuarios: ");
		qtdUsuarios = scan.nextInt();*/
		usuarioex3 user[] = new usuarioex3[2];
		
		System.out.println("----------------------------------------------");
		System.out.println("Cod | Titulo Livros          | Preço         |");
		System.out.println(" 1  | A bela e a ferá        | R$ 50,00      |");
		System.out.println(" 2  | O pequeno principe     | R$ 100,00     |");
		System.out.println("----------------------------------------------");
		
		
		for (int i = 0; i < user.length; i++) {
			user[i] = new usuarioex3();
			user[i].escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do livro que você quer alugar:"));
			user[i].nome = JOptionPane.showInputDialog("Digite o nome do usuario:");
			user[i].dias = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtd de dias alugado:"));
			user[i].opcao = JOptionPane.showInputDialog("sair ou continuar?");
			user[i].titulo = aluguel(user[i].escolha, user[i].titulo);
			user[i].valor = valor(user[i].escolha, user[i].valor);
			
			if (user[i].opcao.equalsIgnoreCase("sair")) {
				break;
			}
		}
		for (int i = 0; i < user.length; i++) {
			System.out.println("Nome: " + user[i].nome + " Titulo: " + user[i].titulo + " Valor: " + user[i].valor + " Dias: " + user[i].dias);
			System.out.println("O preço é: " + calAluguel(user[i].valor, user[i].dias));
			System.out.println("A multa é: " + ((calAluguel(user[i].valor, user[i].dias)-user[i].valor)));
		}

	}

	public static double calAluguel(double calc, int dias) {
		double x = calc, z = 0;
		int y = dias;
		if (dias >= 5) {
			z = (((calc / 100) * 10) + x);
		}

		return z;

	}
	
	  public static String aluguel (int op, String livro) {
		  switch (op) {
			case 1 :
			livro = "A bela e a ferá";
				break;
			case 2:
			livro = "o pequeno principe";	
				break;
			default:
				break;
			}
		  
	 return livro;
	  
	  } public static double valor (int op, double valor) {
		  switch (op) {
			case 1 :
			valor = 50;
				break;
			case 2:
			valor = 100;	
				break;
			default:
				break;
			}
		  
	 return valor;
	  
	  }	 

}
