package ArrayProgramming;
//create array by taking values from Scanner and Print only
//	-Even numbers from an array

import java.util.Scanner;
public class Array_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int size = sc.nextInt();
		System.out.println("Enter some array values:");
		int a[] = new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Even numbers  from an array: ");
		for(int j=0;j<size;j++)
		{
			if(a[j]%2==0)
			{
				System.out.println(a[j]);
				sc.close();//method of Scanner
			}
		}
	}
}

