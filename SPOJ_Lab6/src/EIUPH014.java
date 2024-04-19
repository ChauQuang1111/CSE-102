import java.util.Scanner;

public class EIUPH014 {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr;
		int n = in.nextInt();
		while (n != 0) {
			int count = 0;
			arr = new int[n];
			int i;
			for (i = 0; i < arr.length; i++)
				arr[i] = in.nextInt();
			while (!isSame(arr)) {
				int t = arr[0];
				for (i = 0; i < arr.length - 1; i++) {
					arr[i] = Math.abs(arr[i] - arr[i + 1]);
				}
				arr[i] = Math.abs(arr[i] - t);
				//System.out.println();
				//output(arr);
				count++;
				if (count > 1000)
					break;
			}
			if (count > 1000)
				System.out.println(-1);
			else
				System.out.println(count);
			n = in.nextInt();
		}

	}

	// Hàm kiểm tra giống nhau
	public static boolean isSame(int[] a) {
		for (int i = 0; i < a.length - 1; i++)
			if (a[i] != a[i + 1])
				return false;
		return true;
	}

	// out put
	public static void output(int[] d) {
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}
	}
}
