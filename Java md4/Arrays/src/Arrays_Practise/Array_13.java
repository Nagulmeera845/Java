package Arrays_Practise;

import java.util.Scanner;

//WAP to print second max from an array by using userdefine method

public class Array_13 {
	 public static void secondMax(int a[])
	 {
	 
		 int max=a[0],smax=a[0];
	 
	 for(int i=0;i<a.length;i++)
	 {
		 if(a[i]>max) {
			 smax=max;
		 max=a[i];
		 }
		 else if(a[i]>smax) {
			 smax=a[i];
	 }
	 }	 
	 
	System.out.println("Maximum from array :"+max);
	System.out.println("Second max from array : "+smax);
	 }
	
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter your array size:");
	 int size=sc.nextInt();
	 System.out.println("Enter some array values:");
	 int a[]=new int [size];
	 for(int i=0;i<size;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 secondMax(a);
	 sc.close();
 }
}
