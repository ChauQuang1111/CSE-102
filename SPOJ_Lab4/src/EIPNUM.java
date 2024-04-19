import java.util.Scanner;

public class EIPNUM {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long original = n;
		long ditgit = 0;
		long reverse = 0;
		while (n > 0) {
			ditgit = n % 10;
			reverse = reverse * 10 + ditgit;
			n /= 10;
		}
		if (reverse == original) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
