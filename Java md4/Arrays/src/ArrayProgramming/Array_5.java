package ArrayProgramming;
//Array by taking values from user and printing in reverse
import java.util.Scanner;

public class Array_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		System.out.println("Enter some array values: ");
		int a[] = new int[size];
		for(int i=0;i<size;i++)//logic for array size execution
		{
			a[i]=sc.nextInt();
		}
		System.out.println("reverse value are : ");
		for(int j=size-1;j>=0;j--)//logic for printing array value in reverse order
		{
			System.out.println(a[j]);
			sc.close();//method of Scanner
		}

	}

}
