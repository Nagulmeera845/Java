package Arrays_Practise;
//Wap  to print max,min,second max,second min from an sorted array
import java.util.Scanner;

public class Array_17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		System.out.println("Enter your values:");
		int a[]=new int[size];
		for(int i=0;i<size;i++)// logic for size execution
		{
			a[i]=sc.nextInt(); //implementation of array size
		}
		System.out.println("Sorting values:");
		int temp=0;//extra var for swapping
		for(int i=0;i<a.length;i++)// logic for printing
		{
			for(int j=0;j<a.length-1;j++)//a.length-1 means refer next index value
			{
				if(a[j]>a[j+1])
				{               //for swapping
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
		System.out.println("Max:"+a[size-1]);
		System.out.println("Min:"+a[0]);
		System.out.println("Second Max:"+a[size-2]);
		System.out.println("Second Min:"+a[1]);
		sc.close();
	}

}
