import java.util.Scanner;

public class EIUPH012_1 {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		 int [] arr = {1, 2, 3, 0, 9};
		    int maxEven, firstEven = -1;
		    for (int i = 0; i < arr.length; i++)
		       if(arr [i]%2 == 0)
		        {
		            firstEven = arr [i];
		            break;
		        }
		    maxEven = firstEven;
		    for (int j = 0; j < arr.length; j++)
		        if (arr [j]%2 == 0 && arr [j]>maxEven)
		           maxEven = arr [j];
		    if (maxEven == -1)
		       System.out.println ("No even numbers in this array!");
		    else
		       System.out.println ("The maximum even number is: "+maxEven);
		

	}

}
