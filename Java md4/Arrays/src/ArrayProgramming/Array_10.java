package ArrayProgramming;
//	WAP to print the min number from an array by using userdefined method
import java.util.*;
public class Array_10 {
	public static void min(int a[])
	{
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
	
   System.out.println("Minimum from value from array: "+min);
	}
	public static void main(String[] args)
		{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size :");
    int size=sc.nextInt();
    int a[]=new int[size];
    for(int i=0;i<size;i++)
    {
    	a[i]=sc.nextInt();
    }
    min(a);
    sc.close();
	}

}
