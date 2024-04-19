import java.util.Scanner;

public class EIUPH012_2 {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int arr[]=input();
		int max,first=-1;
		for(int i=0;i<arr.length;i++ )
			if(arr[i]%2==0) {
				first=arr[i];
				break;
			}
		max=first;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]%2==0 && arr[j]>max)
				max=arr[j];
		}
		if(max==-1)
			System.out.println(-1);
		else
			System.out.println(max);

	}
	//hàm input
	public static int[] input() {
		int n=in.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<arr.length;i++)
			arr[i]=in.nextInt();
		return arr;
	}

}
