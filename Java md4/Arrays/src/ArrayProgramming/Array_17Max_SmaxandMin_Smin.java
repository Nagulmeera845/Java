package ArrayProgramming;

import java.util.Scanner;

public class Array_17Max_SmaxandMin_Smin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Sorting values: ");
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
		System.out.println("max: "+a[size-1]);
		System.out.println("Min: "+a[0]);
		System.out.println("Second max:"+a[size-2]);
		System.out.println("Second Min:"+a[1]);
		
		sc.close();

	}

}
