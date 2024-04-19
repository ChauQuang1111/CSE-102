import java.util.Scanner;

public class EIUPH008 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long x = in.nextLong();
		long n = in.nextLong();
		long k = in.nextLong();
		long res;
		res = 1;
		// x = x % k;
		for (int i = 1; i <= n; i++) {
			res = (res * x % k) % k;
		}
		System.out.println(res);

	}

}
