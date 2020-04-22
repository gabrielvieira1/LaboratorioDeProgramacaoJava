package lista04labEntidades;


import java.util.Scanner;

public class Eleitor extends Candidato {

    private int titulo;

    public Eleitor(String nome, String CPF, int titulo) {
        super(nome, CPF);
        this.titulo = titulo;
    }

    public Eleitor() {
    }

    public int getTitulo() {
        return titulo;
    }

    public void setTitulo(int titulo) {
        this.titulo = titulo;
    }

}
