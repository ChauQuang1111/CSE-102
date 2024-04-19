package Lab3;

import java.util.Scanner;

public class EI2021Q12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		if (a > b)
			System.out.println("Wrong");
		long i = a;
		long n = b;
		int count = 0;
		for (; i <= n; i++) {
			if (isPrimenumber(i)) {
				// System.out.print(i+" ");
				count++;
			}
		}
		System.out.print(count);
	}

	public static boolean isPrimenumber(long n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		//break;

		return true;
	}
}
