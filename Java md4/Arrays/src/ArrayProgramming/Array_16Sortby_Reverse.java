package ArrayProgramming;
//Descending order
import java.util.Scanner;

public class Array_16Sortby_Reverse {
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);//object
     System.out.println("Enter array size:");
     int size=sc.nextInt();//methos or scanner
     int a[]=new int[size];//array creation
     for(int i=0;i<size;i++)//scaneer class execution
     {
     	a[i]=sc.nextInt();//i =index refer to scanner class metod
     }
     System.out.println("Sorting values/Descending order:");
     int temp=0;//extra varibale for swapping
     for(int i=0;i<a.length;i++)
     {
     	for(int j=0;j<a.length-1;j++)
     	{                         //for sorting
     		if(a[j]<a[j+1])//refer to next index position
     		{
     			temp=a[j];
     			a[j]=a[j+1];
     			a[j+1]=temp;
     		}
     	}
     }
     //printing after sorting
     for(int k=0;k<size;k++)
     {
     	System.out.println(a[k]);
     	sc.close();
     }
 	}
	}


