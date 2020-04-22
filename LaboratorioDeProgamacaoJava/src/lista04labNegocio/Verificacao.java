/**
 * 
 */
/**
 * @author Gabriel
 *
 */
package lista04labNegocio;


import lista04labApresentacao.Apresentacao;
import lista04labEntidades.Candidato;
import lista04labEntidades.Eleitor;

public class Verificacao {

    public static boolean temNumero(lista04labEntidades.Candidato c1[], int num) {
        
            if(num == c1[0].getNumero()){
                lista04labEntidades.Candidato.totalVotos[0]++;
                return(true);
            }else if(num == c1[1].getNumero()){
                lista04labEntidades.Candidato.totalVotos[1]++;
                return(true);
            }else{
                mensagemErroNumero();
                return(false);
            }      
    }
    
    public static boolean temTituloJa(lista04labEntidades.Eleitor e1 [], int titulo, int indice){
        for(int i = 0; i < indice; i ++){
            if(titulo == e1[i].getTitulo()){
               return(true);
            }
        }
        return(false);
    }
    
    public static void mensagemErroNumero(){
        System.out.println("Erro, não existe candidato com esse número, digite novamente: ");
    }
        
    public static String vencedor(lista04labEntidades.Candidato c1[]){
        double total = lista04labEntidades.Candidato.totalVotos[0] + lista04labEntidades.Candidato.totalVotos[1];
        double pctVencedor;
        if(lista04labEntidades.Candidato.totalVotos[0] > lista04labEntidades.Candidato.totalVotos[1]){
            pctVencedor = (lista04labEntidades.Candidato.totalVotos[0] * 100)/total;
            return("Candidato " + c1[0].getNome() + " é o vencedor !!!\nCPF: " + c1[0].getCPF() + "\nPartido: " + c1[0].getPartido() + "\nGanhou com " + pctVencedor +"% dos votos");
        }else{
            pctVencedor = (lista04labEntidades.Candidato.totalVotos[1] * 100)/total;
            return("Candidato " + c1[1].getNome() + " é o vencedor !!!\nCPF: " + c1[1].getCPF() + "\nPartido: " + c1[1].getPartido() + "\nGanhou com " + pctVencedor +"% dos votos");
        }
    }
}
    
