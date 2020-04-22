package lista02lab;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Cliente {
	String nome, tipoVeiculo, combustivel;
	double qtdLitro;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cliente cliente[] = new Cliente[1];
		int indice= 0;
		String escolha;
		do {
			//pddir user
			cliente[indice] = new Cliente();
			cliente[indice].nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
			cliente[indice].tipoVeiculo = JOptionPane.showInputDialog("Digite o tipo do veiculo:");
			cliente[indice].combustivel = JOptionPane.showInputDialog("Digite o tipo do combustivel:");
			cliente[indice].qtdLitro = Double.parseDouble(JOptionPane.showInputDialog("Digite a qtd de Litro que será abastecido:"));
			escolha = JOptionPane.showInputDialog("Digite sair ou continuar:");
				Cliente array[] = new Cliente[cliente.length + 1];
				System.arraycopy(cliente, 0, array, 0, cliente.length);
				cliente = array;
				indice++;
		} while (!escolha.equalsIgnoreCase("sair"));
		
		for (int i = 0; i < cliente.length-1; i++) {
			
			System.out.println(cliente[i]);
		}
		
	}
	public static void imprimir(String imp) {
		
	}
	@Override
	public String toString() {
		return "Nome: " + nome + " Tipo veiculo: " + tipoVeiculo + " Combustivel: " + combustivel + " Litros: "
				+ qtdLitro;
	}
	
	
	
}
