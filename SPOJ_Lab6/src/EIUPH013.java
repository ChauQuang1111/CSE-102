import java.util.Scanner;

public class EIUPH013 {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++)
			a[i] = in.nextInt();
		for (int i = 0; i < m; i++) {
			int type = in.nextInt();
			int idx = in.nextInt();
			if (type == 0)
				a = removeAt(a, idx);
			if (type == 1) {
				if (idx >= 0 && idx < a.length)
					System.out.println(a[idx]);
				else
					System.out.println(-1);
			}

		}

	}

	// Xóa 1 phần tử X ra khỏi dãy
	public static int[] removeAt(int[] a, int k) {
		int[] b = new int[a.length - 1];
		for (int i = 0; i < k; i++)
			b[i] = a[i];
		for (int i = k; i < b.length; i++)
			b[i] = a[i + 1];
		return b;
	}

}
