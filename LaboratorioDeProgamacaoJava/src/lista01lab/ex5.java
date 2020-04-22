package lista01lab;
import java.util.Scanner;
public class ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double preco, valorTotal;
		int quantidade, codPagamento = 0;
		
		System.out.println("Digite o preço do produto:");
		preco = scan.nextDouble();
		System.out.println("Digite a qtd: ");
		quantidade = scan.nextInt();
		System.out.println("-------------------------------------------------------------");
		System.out.println("codigo | condição de pagamento");
		System.out.println("1      | À vista ou cheque, receba com 10% de desconto");
		System.out.println("2      | À vista no cartão de credito, receba com 5% de desconto");
		System.out.println("3      | Em duas vezes, preço normal sem juros");
		System.out.println("4      | Em três vezes, preço normal com 15% de juros");
		System.out.println("-------------------------------------------------------------");
		System.out.println("Digite o cod de Pagamento: ");
		codPagamento = scan.nextInt();
		switch (codPagamento) {
		case 1:
			valorTotal = (((preco * quantidade)/100)*10-(preco * quantidade));
			System.out.println(valorTotal);
			break;
		case 2:
			valorTotal = (((preco * quantidade)/100)*5-(preco * quantidade));
			System.out.println(valorTotal);
		case 3:
			valorTotal = preco * quantidade;
			System.out.println(valorTotal);
		case 4:
			valorTotal = (((preco * quantidade)/100)*15+(preco * quantidade));
			System.out.println(valorTotal);
		default:
			break;
		}
	}

}
