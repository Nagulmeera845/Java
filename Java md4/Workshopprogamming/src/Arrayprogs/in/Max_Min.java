package Arrayprogs.in;
import java.util.*;
public class Max_Min {
	public static void main(String[]args)
	{
		Scanner Sc=new Scanner(System.in);
				System.out.println("enter the size of the array: ");
		int size =Sc.nextInt();
		int a[] =new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=Sc.nextInt();
		}
		int max=a[0],min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else
			{
				min=a[i];
			}
		
			System.out.println(max+" "+min);
			int difference =max-min;
			System.out.println("difference  : "+difference);
		}
		
	}

}
