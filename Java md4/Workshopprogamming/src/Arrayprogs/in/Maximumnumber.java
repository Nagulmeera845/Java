package Arrayprogs.in;
import java.util.*;
public class Maximumnumber {
	public static void main(String[]args)
	{
		Scanner Sc =new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=Sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=Sc.nextInt();
		}
		int max=a[0];
		for(int j=1;j<a.length;j++)
		{
			if(a[j]>max)
			{
				max=a[j];
			}
		}
		System.out.println("maximum number from array : "+max);
	}

}
