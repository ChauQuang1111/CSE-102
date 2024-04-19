import java.util.Scanner;

public class EIUPH006_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		n = Math.abs(n);
		int count = 0;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			while (n % i == 0) {
				count++;
				n /= i;
			}
		}
		if (n > 1) {
			count++;
		}
		System.out.println(count);

	}

}
