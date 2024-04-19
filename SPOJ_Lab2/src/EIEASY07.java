import java.util.Scanner;

public class EIEASY07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long cons = in.nextInt();
		long pay = 0;
		if (cons <= 100) {
			pay = cons * 200;
		} else if (cons <= 1100) {
			pay = (100 * 200) + (cons - 100) * 500;
		} else if (cons <= 3100) {
			pay = (100 * 200) + (1000 * 500) + (cons - 1100) * 1000;
		} else if (cons <= 8100) {
			pay = (100 * 200) + (1000 * 500) + (2000 * 1000) + (cons - 3100) * 10000;
		} else if (cons <= 18100) {
			pay = (100 * 200) + (1000 * 500) + (2000 * 1000) + (5000 * 10000) + (cons - 8100) * 12000;
		} else {
			pay = (100 * 200) + (1000 * 500) + (2000 * 1000) + (5000 * 10000) + (10000 * 12000) + (cons - 18100) * 100000;
		}
		System.out.println(pay);

	}

}
