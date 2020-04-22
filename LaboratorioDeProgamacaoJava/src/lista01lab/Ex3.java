package lista01lab;

import java.util.Scanner;
//public class ex1 {
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double menorIdade = Integer.MAX_VALUE;
		int a, c = 0;
		String b, opcao = null;
		int qtdhabitantes = 0;
		System.out.println("Digite a qtd de habitantes:");
		qtdhabitantes = scan.nextInt();
		Ex3registro habitante[] = new Ex3registro[qtdhabitantes];
		/*
		 * do { } while (!opcao.equalsIgnoreCase("Sair"));
		 */
		for (int j = 0; j < habitante.length; j++) {
		//	arrayTemp[i] = Ex3registro[i];
			
			habitante[j] = new Ex3registro();
			System.out.println("Digite o nome do Habitante:");
			habitante[j].nome = scan.next();
			System.out.println("Digite o sexo:");
			habitante[j].sexo = scan.next();
			System.out.println("Digite a cor dos olhos:");
			habitante[j].corOlhos = scan.next();
			System.out.println("Digite a cor do cabelo:");
			habitante[j].corCabelos = scan.next();
			System.out.println("Digie a idade:");
			habitante[j].idade = scan.nextInt();
		}
		for (int j = 0; j < habitante.length; j++) {
			switch (habitante[j].sexo) {
			case "M":
				if (habitante[j].idade < menorIdade) {
					menorIdade = habitante[j].idade;
					c = j;
					System.out.println("O nome menor idade é:" + habitante[c].nome + "a idade é:" + menorIdade);
				}
				System.out.println("Nome: " + habitante[c].nome + " Sexo: " + habitante[c].sexo + " Cor dos olhos: "
						+ habitante[c].corOlhos + " Cor do cabelo: " + habitante[c].corCabelos + " Idade: "
						+ habitante[c].idade);
				break;
			default:
				break;
			}
		}
	}
}
