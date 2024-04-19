import java.util.Scanner;

public class EIUPH010 {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[] = input();
		System.out.println();
		findMaxOccur(arr);

	}

	// hàm tìm số lần xuất hiện nhiều nhất
	public static void findMaxOccur(int[] a) {
		//int max_val = a[0];
		int idx = 0;
		int max_dem = demX(a, a[0]);
		for (int i = 1; i < a.length; i++) {
			int dem = demX(a, a[i]);
			if (dem > max_dem) {
				max_dem = dem;
				idx = i;
				//max_val = a[i];
				
			} else if (max_dem == dem && a[idx] > a[i])
				idx = i;
				//max_val = a[i];
		}
		System.out.println(a[idx] + " " + max_dem);
	}

	// hàm kiểm tra x có trong dãy
	public static int demX(int a[], int x) {
		int count = 0;
		for (int i : a)
			if (i == x)
				count++;
		return count;
	}

	// hàm input
	public static int[] input() {
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = in.nextInt();
		return arr;
	}

}
