package Arrays_Practise;

//WAP to print the max num from an array by using scanner

import java.util.Scanner;

public class Array_11Maxnum {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in); //scanner object
    System.out.println("Enter your array size:");
    int size=sc.nextInt();//scanner method
    System.out.println("Enter your random num's:");
    int a[]=new int [size];//logic for array creation
    for(int i=0;i<size;i++)//logic for array size execution 
    {
    	a[i]=sc.nextInt();
    }
    int max=a[0];//Assumption
    for(int i=0;i<a.length;i++)// logic for printing
    {
    	if(a[i]>max)//logic for find max num
        max=a[i];// used for storing max value
    }
    System.out.println("Maximum num from array:"+max);
    sc.close();
	}

}
