package lista01lab;

import javax.swing.JOptionPane;

public class ex6 {

	public static void main(String[] args) {
		StringBuffer eleEla = new StringBuffer();
		String nomeSexo[] = new String[2];
	//	String nome;
		int posicao = 0;
		Usuario user[] = new Usuario[2];
		String UserPagode[] = new String[2];
		for (int i = 0; i < user.length; i++) {
			user[i] = new Usuario();
			user[i].nome = JOptionPane.showInputDialog("Digite um nome: ");
			user[i].sexo = JOptionPane.showInputDialog("Digite o sexo:");
			user[i].hobby = JOptionPane.showInputDialog("Digite o Hoby");
			user[i].musica = JOptionPane.showInputDialog("Digite o  Estilo de Musica:");
			user[i].banda = JOptionPane.showInputDialog("Digite a banda preferida:");
		}
		for (int i = 0; i < user.length; i++) {
			switch (user[i].sexo) {
			case "M":
				eleEla.append("Sr " + user[i].nome);
				nomeSexo[i] = eleEla.toString();
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("Nome: " + nomeSexo[i] + " Sexo: " +user[i].sexo + " Hobby: "+user[i].hobby +" Estilo de Musica: "+user[i].musica+" Bandas: "+user[i].banda+"|");
				eleEla = new StringBuffer();
				break;
			case "F":
				eleEla.append("Sra " + user[i].nome);
				nomeSexo[i] = eleEla.toString();
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("Nome: " + nomeSexo[i] + " Sexo: " +user[i].sexo + " Hobby: "+user[i].hobby +" Estilo de Musica: "+user[i].musica+" Bandas: "+user[i].banda+"|");
				eleEla = new StringBuffer();
			default:
				break;			
			}
		//	System.out.println("-------------------------------------------------------------------------");
		//	System.out.println("Nome: " + nomeSexo[i] + " Sexo: " +user[i].sexo + " Hobby: "+user[i].hobby +" Estilo de Musica: "+user[i].musica+" Bandas: "+user[i].banda+"|");
		//	System.out.println("Nome: " + nomeSexo[posicao] + " Bandas: "+user[posicao].banda+"|");
		}
		for (int i = 0; i < user.length; i++) {
			switch (user[i].musica) {
			case "pagode":
				posicao = i;
				System.out.println("---------------Usuarios que gostam de pagode------------------------");
				System.out.println("Nome: " + nomeSexo[posicao] + " Bandas: "+user[posicao].banda+"|");
				System.out.println("--------------------------------------------------------------------");
				//UserPagode[i] <= i;
				break;
			default:
				break;
			}
			for (int j = 0; j < UserPagode.length; j++) {
				switch (user[j].hobby) {
				case "ouvir musica":
				//	posicao = j;
					System.out.println("O Estilo de musica é :" + user[j].musica);
					if (user[j].musica.equalsIgnoreCase("forro")) {
						System.out.println("Ouça wesley safadão");
						break;
					} else if (user[j].musica.equalsIgnoreCase("pagode")) {
						System.out.println("Ouça Turma do pagode");
						break;
					} else if (user[j].musica.equalsIgnoreCase("rock")) {
						System.out.println("Ouça red hot");
					} else if (user[j].musica.equalsIgnoreCase("pop rock")) {
						System.out.println("Ouça cpm22");
					} else if (user[j].musica.equalsIgnoreCase("rap")) {
						System.out.println("Ouça Emicida");
					}
					break;
				default:
					break;
				}
			}
			
		}
		
	/*	System.out.println("-------------------------------------------------------------");
		System.out.println("Nome | Sexo | Hobby | Musicas | Bandas ");
		System.out.println("Francisco | M | Ouvir Musica | Forró | Aviôes do forró");
		System.out.println("Maria | F | Correr | Pop Rock | Skank");
		System.out.println("João | M | Ouvir musica | pagode | Molejo ");
		System.out.println("Vitoria | F | Nadar | Pagode | Raça Negra");
		System.out.println("Adriana | F | Ouir Musica | Rock | Metálica");
		System.out.println("-------------------------------------------------------------");
		System.out.println("Digite o cod de Pagamento: ");*/

	}
/*	public static String alteraNome(String nomeSexo) {
		StringBuffer eleEla = new StringBuffer("Sr");
		eleEla.append()
	}*/

}
