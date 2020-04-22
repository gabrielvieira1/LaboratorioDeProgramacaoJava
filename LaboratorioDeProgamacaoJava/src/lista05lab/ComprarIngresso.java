package lista05lab;



import java.util.Scanner;

public class ComprarIngresso {
	private static Scanner scan;

	public static void show(int j, int i, Ingresso normal, Ingresso adc) {
		CamaroteInferior inferior = new CamaroteInferior();
		CamaroteSuperior superior = new CamaroteSuperior();
		Normal normal1 = new Normal();

		scan = new Scanner(System.in);
		int escolha;
		String nome;

		System.out.println("Informe seu nome: ");
		nome = scan.next();

		System.out.println(nome + ", escolha seu ingresso:");
		System.out.println("1 - Normal");
		System.out.println("2 - VIP");
		escolha = scan.nextInt();

		switch (escolha) {
		case 1:
			System.out.println(nome + ", você escolheu o ingresso normal. Valor a pagar: " + normal1.getValor());
			break;
		case 2:
			System.out.println(nome + ", você escolheu o ingresso VIP, selecione a área:");
			System.out.println("Para Camarote Inferior, na área B, digite '1'");
			System.out.println("Para Camarote Superior, na área A, digite '2'");
			int a = scan.nextInt();
			switch (a) {
			case 1:
				System.out.println(nome + ", você escolheu o Camarote Inferior. Valor a pagar: " + inferior.getCi());
				break;
			case 2:
				System.out.println(nome + ", você escolheu o Camarote Superior. Valor a pagar: " + superior.getCs());
				break;
			}
			break;
		}
	}

	public static void main(String[] args) {
		CamaroteInferior inferior = new CamaroteInferior();
		CamaroteSuperior superior = new CamaroteSuperior();
		Normal normal = new Normal();
		Vip vip = new Vip();
		show(inferior.getCi(), superior.getCs(), normal.getNormal(), vip.getAdc());
	}
}
