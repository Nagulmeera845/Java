package ArrayProgramming;
//WAP to print diff b/w max&min values- 
//-from an array by using userdefined method
import java.util.Scanner;
public class Array_12 {
	public static void maxAndminDiff(int a[])
	{
		int max=a[0],min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max) {
				max=a[i];
			}
			else if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Maximum from array: "+max);
		System.out.println("Minimum from array: "+min);
		int diff=max-min;
		System.out.println(max+"-"+min+" diff is : "+diff);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		maxAndminDiff(a);
		sc.close();
   
	}

}
