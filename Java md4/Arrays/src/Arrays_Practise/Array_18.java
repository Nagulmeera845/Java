package Arrays_Practise;

import java.util.Scanner;

public class Array_18 {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter arraysize :");
   int size=sc.nextInt();
   System.out.println("Enter some array values:");
   int a[]=new int[size];
   for(int i=0;i<size;i++)//logic for array size execution
   {
	   a[i]=sc.nextInt();//implementation of Scanner
   }
   for(int i=0;i<size;i++)//prime number logic
   {
  	 int count=0;
  	 for(int j=1;j<=a[i];j++)
  	 {
  		 if(a[i]%j==0) {
  			 count++;
  	 }
  	 }    	 
  	 if(count==2)
  		 System.out.println(a[i]+": is prime number");
  	 sc.close();
   }
   }
	}


