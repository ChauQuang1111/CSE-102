import java.util.Scanner;

public class EIPRIFACTOR {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long i = 2;

		if (isPrime(n)) {
			System.out.println(n + " " + 1);

		} else {
			while (n != 1) {
				int count = 0;
				while (n % i == 0) {
					count++;
					n = n / i;
				}
				if (count != 0)
					System.out.println(i + " " + count);
				i++;
			}
		}
	}

	public static boolean isPrime(long n) {
		if (n < 2)
			return false;

		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0)
				;
			return false;
		}

		return true;
	}
}
