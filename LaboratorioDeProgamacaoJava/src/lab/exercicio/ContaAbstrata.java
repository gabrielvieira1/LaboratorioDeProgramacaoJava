package lab.exercicio;

public abstract class ContaAbstrata {
	
	private String numeroConta;
	private double saldo;
	private Cliente cliente;
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public abstract double obterLimite();
	
	public abstract void depositar(double valor);
	
	public abstract void sacar(double valor);

}
