package lista02lab;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[10];
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("Digite os valores de A:");
			a[i] = scan.nextInt();
		} for (int i = 0; i < b.length; i++) {
			b[i] = a[i]*3;
			System.out.println("Os elementos de B são: " + b[i]);
		}
	}

}
