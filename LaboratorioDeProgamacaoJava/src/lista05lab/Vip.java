package lista05lab;


public class Vip extends Ingresso {
	Ingresso adc = new Ingresso();

	public int adicional(int valor) {
		int vip = valor + 20;
		return vip;

	}

	public Ingresso getAdc() {
		return adc;
	}

	public void setAdc(Ingresso adc) {
		this.adc = adc;
	}

}
