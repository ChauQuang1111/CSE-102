import java.util.Scanner;

public class EIUPH011 {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = input();
		arr = removedup(arr);
		output(arr);
	}

	// Xoa
	public static int[] removedup(int[] a) {
		int[] b = new int[0];
		for (int i = 0; i < a.length; i++) {
			if (!timX(b, a[i]))
				b = themvitri(b, a[i], b.length);
		}
		return b;
	}

	// themvitri
	public static int[] themvitri(int[] a, int val, int pos) {
		int[] b = new int[a.length + 1];
		int i;
		for (i = 0; i < pos; i++)
			b[i] = a[i];
		b[pos] = val;
		for (i = pos + 1; i < b.length; i++)
			b[i] = a[i - 1];
		return b;
	}

	// Ham tim x
	public static boolean timX(int[] a, int x) {
		for (int i : a)
			if (i == x)
				return true;
		return false;
	}

	// Ham input
	public static int[] input() {
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++)
			a[i] = in.nextInt();
		return a;

	}

	// out put
	public static void output(int[] d) {
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}
	}

}
