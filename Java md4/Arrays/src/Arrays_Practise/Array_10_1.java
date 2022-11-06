package Arrays_Practise;
//WAP to print the min num from an array by using below Scanner
import java.util.Scanner;

public class Array_10_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your array size:");
		int size=sc.nextInt();
		System.out.println("Enter your lucky random numbers:");
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int j=0;j<a.length;j++)
		{
			if(a[j]<min)
				min=a[j];
		}
		System.out.println("Minimum number from given array is:"+min);
	}

}
