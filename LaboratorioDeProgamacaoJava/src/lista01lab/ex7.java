package lista01lab;

public class ex7 {

	public static void main(String[] args) {
		int x = 1, y = 0, z= 0;
		
		for (int i = 0; i < 4500; i++) {
			x = x + y;
			y = x - y;
			System.out.print(x +", ");
		}
		
	}

}
