package lista01lab;

import java.util.Scanner;

public class ex1 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			calculo(0);
		}
		private static void calculo(int args) {
			Scanner scan = new Scanner(System.in);
			int x = 0, y=0, z = 1;
			System.out.println("Digite a base:");
			x = scan.nextInt();
			System.out.println("Digite o expoente:");
			y = scan.nextInt();
		//	z = x * y;
			if (x == 0) {
				z = 0;
				System.out.println(z);
			} else {
				for (int i = 0; i < y; i++) {
					z *=x;
				}
				System.out.println(z);
			}		
		}

}
