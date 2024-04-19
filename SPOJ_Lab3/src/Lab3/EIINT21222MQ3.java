package Lab3;

import java.util.Scanner;

public class EIINT21222MQ3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long n1 = n;
		long ld, sum;
		if (n < 100)
			System.out.println("NO");
		else {
			ld = n % 10;
			while (n != 0) {
				n = n / 10;
				if (n < 10)
					break;
			}
			sum = ((n * 10) + ld);
			if (n1 % sum == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
