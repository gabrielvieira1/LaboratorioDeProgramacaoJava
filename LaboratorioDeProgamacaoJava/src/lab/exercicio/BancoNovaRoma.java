package lab.exercicio;

public class BancoNovaRoma implements IBancogeral{

	public ContaAbstrata abrirConta(Cliente c, String numeroConta, double saldoInicial, String tipo) {
		if (tipo.equalsIgnoreCase("poupanca")) {
			
		}
		
		return null;
	}

	public boolean depositar(ContaAbstrata c, double valor) {
		return false;
	}

	public boolean sacar(ContaAbstrata c, double valor) {
		return false;
	}
	
	

}
