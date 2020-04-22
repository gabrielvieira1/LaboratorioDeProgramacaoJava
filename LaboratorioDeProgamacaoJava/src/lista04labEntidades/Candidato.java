/**
 * 
 */
/**
 * @author Gabriel
 *
 */
package lista04labEntidades;


import java.util.Scanner;

public class Candidato {

    private String nome;
    private String CPF;
    private int numero;
    private String partido;
    public static int totalVotos[] = new int[2];

    public Candidato(String nome, String CPF, int numero, String partido) {
        this.nome = nome;
        this.CPF = CPF;
        this.numero = numero;
        this.partido = partido;
    }

    

    public Candidato(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }
    
    

    public Candidato() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

}
