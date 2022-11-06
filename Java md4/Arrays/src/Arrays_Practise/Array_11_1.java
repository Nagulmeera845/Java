package Arrays_Practise;
//WAP to print the max num from an array by using below userdefine method

import java.util.Scanner;

public class Array_11_1 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);//Scanner object
     System.out.println("Enter your array size:");
     int size=sc.nextInt();//scanner method
     System.out.println("Enter random num's :");
     int a[]=new int[size];//array creation
     for(int i=0;i<size;i++)// logic for size execution
     {
    	 a[i]=sc.nextInt();
    	
     }
     sc.close();
     max(a);//call to user defined method
	}
     public static void max(int a[])//userdefine method
     { 
    	 int max=a[0];//assumption
    	for(int i=0;i<a.length;i++)//logic for printing
    	{
    		if(a[i]>max)//for find max num
            max=a[i]; //used for to store max value
    		

       	}
     System.out.println("Maximum num from array is:"+max);
     
	
	}

}
