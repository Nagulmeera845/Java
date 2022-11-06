package Arrays_Practise;

import java.util.Scanner;

public class Array_15 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array size:");
    int size=sc.nextInt();
    System.out.println("Enter some array values:");
    int a[]=new int[size];
    for(int i=0;i<size;i++) //logic for array size execution
    {
    	a[i]=sc.nextInt();
    }
    int temp=0;// extra var for swapping
    for(int i=0;i<a.length;i++)//logic for printing/sorting
    {
    for(int j=0;j<a.length-1;j++)//logic for refer to next index position
    {
    	if(a[j]>a[j+1])//check condition/value
    	{              // for swapping
    		temp=a[j];
    		a[j]=a[j+1];
    		a[j+1]=temp;
    	}
    }
    }
    System.out.println("Sorted array values:");
    for(int k=0;k<size;k++)// for printing
    {
    	System.out.println(a[k]);
    }
    sc.close();
    }
	}


