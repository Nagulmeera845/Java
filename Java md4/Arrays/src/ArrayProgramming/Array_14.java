package ArrayProgramming;
//WAP to second minimum  from the array by using user defined method
import java.util.*;

public class Array_14 {
	public static void secondMin(int a[])
	{
		int min=a[0],smin=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				smin=min;
				min=a[i];
			}
			else if(a[i]<smin)
			{
				smin=a[i];
			}	
		}
		System.out.println("Minimum value : "+min);
		System.out.println("SecondMin value :"+smin);
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
		
		secondMin(a);
		sc.close();
	}
}
