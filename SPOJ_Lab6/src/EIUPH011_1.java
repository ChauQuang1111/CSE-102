import java.util.Scanner;

public class EIUPH011_1 {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int []arr=input();
		arr = removeDup(arr);
		output(arr);
	}
	//
	public static int[] removeDup(int[]a) {
		for(int i =0;i<a.length;i++)
			if(timXrange(a,a[i],i)) {
				a = removeAt(a,i);
				i--;
			}
		return a;
	}
	//tim phan tu trong day k, tu doan[0,pos]
	public static boolean timXrange(int[]a, int x, int pos) {
		for(int i=0;i<pos;i++)
			if(a[i]==x)
				return true;
		return false;
	}
	// xoa phan tu tai vi tri k
	public static int[] removeAt(int[]a, int pos) {
		int[] b = new int[a.length-1];
		int i;
		for(i = 0;i<pos;i++)
			b[i] = a[i];
		for(i = pos;i<b.length;i++)
			b[i] = a[i+1];
		return b;
	}
	
	//ham input
	public static int[] input() {
		int n = in.nextInt();
		int []a = new int[n];
		for(int i = 0;i<a.length;i++)
			a[i]=in.nextInt();
		return a;
	}
	//ham output
	public static void output(int []a) {
		for(int i =0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}
