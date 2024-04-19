import java.util.Scanner;

public class EIUPH006 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		int count = 0;
		n = Math.abs(n);
		for (int i = 2; i <= n; i++) {
			int count2 = 0;
			while (n % i == 0) {
				if (count2 == 0) {
					count2++;
					count++;
				}
				n /= i;
			}

		}
		if (n >= 2) {
			count++;
		}
		System.out.println(count);
	}
}