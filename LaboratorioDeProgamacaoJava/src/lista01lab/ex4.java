package lista01lab;

public class ex4 {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5};
		int b[] = {9, 8, 7, 3, 5};
		int c[] = new int[(a.length + b.length) / 2];
		int d = 0;
		
		for (int i = 0; i < c.length; i++) {
			/*while (a[i] == b[i]) {
				c[i] = a[i];
				d = i;*/
				compara(a[i], b[i]);
				//System.out.println(c[d]);
			//	break;
			//}
		/*	if (a[i] == b[i]) {
				c[i] = a[i];
				d = i;
				System.out.println(c[d]);
			} */
	} 
		
	/*	for (int i = 0; i < c.length; i++) {
			
		}*/
	}
	public static void compara(int x, int y) {
		int a[] = {x};
		int b[] = {y};
		int c[] = new int[(a.length + b.length) / 2];
		int d = 0;
		
		for (int i = 0; i < c.length; i++) {
			if (a[i] == b[i]) {
				c[i] = a[i];
				d = i;
				
			}
			System.out.println(c[i]);
			}
		
	}
}
