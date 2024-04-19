import java.util.Scanner;

public class EIUPH012 {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[] = input();
		System.out.println();
		//System.out.println(large(arr));
		
	}
	// hàm check
	public static int large (int[]a) {
		int val = -1;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0 && a[i]>val) {
				val=a[i];
			}
		}
		return val;
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
