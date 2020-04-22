package lista02lab;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x[] = new int[5];
		int y = Integer.MIN_VALUE, z = 0 ; 
		
		for (int i = 0; i < x.length; i++) {
			System.out.println("Digite um numero:");
			x[i] = scan.nextInt();
			if (x[i] > y) {
				y = x[i];
				z = i+1;
			}
		}
		System.out.println("O maior numero é : " + y);
		System.out.println("A posição onde está o maior numero é:" + z);
	}

}
