package lista02lab;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num[] = new int[10];
		double media, soma = 0;
		int qtd = 0;

		for (int i = 0; i < num.length; i++) {
			System.out.println("Digite um numero:");
			num[i] = scan.nextInt();
			soma = soma + num[i];
			qtd = num.length;

		}
		System.out.println("A media Aritmética é: " + mediaAri(soma, qtd));
		media = mediaAri(soma, qtd);

		for (int i = 0; i < num.length; i++) {
			if (num[i] < media) {
				System.out.println("os valores menor que a media são: " + num[i]);
			}
		}

	}

	public static double mediaAri(double med, int qtd) {
		double media;
		media = med / qtd;
		return media;
	}

}
