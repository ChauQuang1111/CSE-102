import java.util.Scanner;

public class EIUPH007 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long res = -1;
		long lastDigit;
		do {
			lastDigit=n%10;
			if (res<lastDigit&&(lastDigit%2==0)){
				res=(long)(n%10);
			}
			n/=10;
			
		} while(n>0);
		System.out.println(res);
		
	}

}
