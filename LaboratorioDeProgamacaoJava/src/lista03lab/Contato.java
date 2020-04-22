package lista03lab;

import java.util.Scanner;

public class Contato {
	private String nome;
	private int idade;
	private char sexo;
	private String celular;
	private String email;
	public String cep;
	public static String ddd = "+55";
	private String cpf;
	Scanner scan = new Scanner(System.in);

	

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public static String getDdd() {
		return ddd;
	}

	public static void setDdd(String ddd) {
		Contato.ddd = ddd;
	}

}
