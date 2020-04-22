package lab.exercicio;

public class ContaCorrente extends ContaAbstrata{

	private double checkEspecial;
	
	
	public double getCheckEspecial() {
		return checkEspecial;
	}

	public void setCheckEspecial(double checkEspecial) {
		this.checkEspecial = checkEspecial;
	}

	public double obterLimite() {
		
		return (getSaldo() + getCheckEspecial());
	}

	public void depositar(double valor) {
		
	}

	public void sacar(double valor) {
		
	}

}
