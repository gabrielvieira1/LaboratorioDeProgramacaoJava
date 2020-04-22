package lab.exercicio;

public interface IBancogeral {
	public ContaAbstrata abrirConta(Cliente c, String numeroConta, double
			saldoInicial, String tipo);
	
	public boolean depositar(ContaAbstrata c, double valor);

	public boolean sacar(ContaAbstrata c, double valor);
}
