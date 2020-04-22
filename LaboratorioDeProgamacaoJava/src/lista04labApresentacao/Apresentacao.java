/**
 * 
 */
/**
 * @author Gabriel
 *
 */
package lista04labApresentacao;


import java.util.Scanner;

import lista04labEntidades.Candidato;
import lista04labEntidades.Eleitor;
import lista04labNegocio.Verificacao;

public class Apresentacao {
    public static void main(String[] args) {
        lista04labEntidades.Candidato c1[] = preencherCandidato();
        printCandidato(c1);
        lista04labEntidades.Eleitor e1[] = preencherEleitor(c1);
        printVencedor(Verificacao.vencedor(c1));      
    }
    
    public static lista04labEntidades.Candidato[] preencherCandidato() {
        lista04labEntidades.Candidato c1[] = new lista04labEntidades.Candidato[2];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 2; i++){
            c1[i] = new lista04labEntidades.Candidato();
            System.out.println("----------CANDIDATO " + (i+1) + "----------\n");
            System.out.println("Informe o nome do candidato: ");
            c1[i].setNome(scan.next());
            System.out.println("Informe o CPF do candidato: ");
            c1[i].setCPF(scan.next());
            System.out.println("Informe o número do candidato: ");
            c1[i].setNumero(scan.nextInt()); scan.nextLine();
            System.out.println("Informe o partido do candidato: ");
            c1[i].setPartido(scan.nextLine());
        
        }
        return(c1);
    }
    
    public static lista04labEntidades.Eleitor[] preencherEleitor(lista04labEntidades.Candidato c1[]){
        boolean aux, auxCondicao;
        Scanner scan = new Scanner(System.in);
        lista04labEntidades.Eleitor e1 [] = new lista04labEntidades.Eleitor [5];
        for(int i = 0; i < 5; i++){
            e1[i] = new lista04labEntidades.Eleitor();
            System.out.println("----------ELEITOR " + (i+1) + "----------\n");
            System.out.println("Informe o nome: ");
            e1[i].setNome(scan.next());
            System.out.println("Informe o CPF: ");
            e1[i].setCPF(scan.next());
            
                System.out.println("Informe o titulo de eleitor: ");
                int auxTitulo = scan.nextInt();
                auxCondicao = Verificacao.temTituloJa(e1, auxTitulo, i);
                if(auxCondicao == false){
                    e1[i].setTitulo(auxTitulo);
                }else{
                    System.out.println("Você já votou !!!");
                    
                }
            
            
            if(auxCondicao == true){
                continue;
            }
            
            do{
                System.out.println("Informe o número do candidato escolhido: ");
                int num = scan.nextInt();
                aux = lista04labNegocio.Verificacao.temNumero(c1, num);
            }while(!aux);
            
        }
        return(e1);
    }
    
    public static void printCandidato(lista04labEntidades.Candidato c1[]){
        System.out.println("\n\n--------------------------------------------\n");
        for(int i = 0; i < c1.length; i++){
            System.out.println("##########CANDIDATO " +(i+1)+ "##########");
            System.out.println("Nome: " + c1[i].getNome());
            System.out.println("Número: " + c1[i].getNumero());
            System.out.println("Partido: " + c1[i].getPartido() + "\n");
        }
        System.out.println("\n--------------------------------------------\n");
    }
    
    public static void printVencedor(String msg){
        System.out.println(msg);
    }
}
