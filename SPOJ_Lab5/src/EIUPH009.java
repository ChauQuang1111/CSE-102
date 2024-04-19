import java.util.Scanner;

public class EIUPH009 {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		boolean kt = true;
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = in.nextInt();
		//kiểm tra
		for (int i = 0; i < n / 2; i++) {
			if (arr[i] != arr[n -1-i]) {
				kt = false;
				break;
			}
		}
		if (kt)
			System.out.println("YES");
		else
			System.out.println("NO");

	}
	
}
