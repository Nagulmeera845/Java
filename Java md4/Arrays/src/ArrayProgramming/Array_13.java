package ArrayProgramming;
//WAP to print second maximum from the array by using userdefined method
import java.util.Scanner;

public class Array_13 {
	public static void secondMax(int a[])
	{
		int max=a[0],smax=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax)
			{
				smax=a[i];
			}	
		}
		System.out.println("Maximum value : "+max);
		System.out.println("SecondMax value : "+smax);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int j=0;j<size;j++)
		{
			a[j]=sc.nextInt();
		}
		secondMax(a);
		sc.close();
		
	}	

}
