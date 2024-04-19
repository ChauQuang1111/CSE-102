import java.util.Scanner;

public class EI2021Q13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int lastDigit;
		int a = -1;
		boolean flag=true;
		while (n > 0) {
			lastDigit =n % 10;
			if(lastDigit>a)	
				flag=true;
			else
				break;
			n /= 10;
		}
		if(flag)
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}
