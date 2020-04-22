package lista05lab;


public class Normal extends Ingresso {
	Ingresso normal = new Ingresso();

	public void imprime(int valor) {
		System.out.println("Ingresso normal: R$" + valor);
	}

	public Ingresso getNormal() {
		return normal;
	}

	public void setNormal(Ingresso normal) {
		this.normal = normal;
	}

}
