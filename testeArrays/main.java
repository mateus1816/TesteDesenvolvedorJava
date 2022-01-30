package testeArrays;

public class main {

	public static void main(String[] args) {

		int[] a = { 1, 8, 4, 6 };
		int[] b = { 3, 7, 9 };
		int[] c = { 2, 5, 0 };

		int[] x = new int[a.length + b.length + c.length];

		int aux = 0, aux2;
		
		for (int i = 0; i<a.length; i++) {
			x[aux++] = a[i];
		}
		
		for (int i = 0; i<b.length; i++) {
			x[aux++] = b[i];
		}

		for (int i = 0; i<c.length; i++) {
			x[aux++] = c[i];
		}

		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length - 1; j++) {
				if (x[j] > x[j + 1]) {
					aux2 = x[j];
					x[j] = x[j + 1];
					x[j + 1] = aux2;
				}
			}
		}

		int y = 0;
		while (y < x.length) {
			System.out.print(x[y] + ", ");
			y++;
		}
	}
}
