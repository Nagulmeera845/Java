package ArrayProgramming;
//WAP to print the max number from an array by using userdefine method
import java.util.*;
public class Array_11 {
	public static void max(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
		  max=a[i];	
		}
	 System.out.println("Maximum from an array : "+max);
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
     max(a);
     sc.close();
}

	}

