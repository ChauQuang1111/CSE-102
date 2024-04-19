package Lab3;

import java.util.Scanner;

public class EI2021Q13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long lastDigit;
		long nextDigit;
		boolean flag = true;
		lastDigit = n % 10;
		while (n > 0) {
			nextDigit = (int) (n % 10);
			if (lastDigit <= nextDigit) {
				lastDigit = nextDigit;
				n /= 10;
			} else {
				flag = false;
				break;
			}

		}
		if (flag)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
