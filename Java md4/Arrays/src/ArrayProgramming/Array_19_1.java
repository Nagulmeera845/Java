package ArrayProgramming;

import java.util.Scanner;

public class Array_19_1 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your array size:");
     int size=sc.nextInt();
     System.out.println("Enter your some array values:");
     int s[]=new  int [size];
     for(int i=0;i<s.length;i++)
     {
    	 s[i]=sc.nextInt();
     }
     int sum=0,count_p=0;
     for(int i=0;i<s.length;i++)
    	 
     {
    	 int count=0;
    	 for(int j=1;j<=s[i];j++)
    	 {
    		 if(s[i]%j==0)
    			 count++;
    	 }
    	 if(count==2)
    	 {
    		 sum=sum+s[i];
    		 count_p++;
    	 }
    	 
     
     }
	

     System.out.println("Sum of prime numbers:"+sum);
     float avg=sum/count_p;
     System.out.println("avg of prime numbers:"+avg);
     System.out.println("count of prime numbers is:"+count_p);
     sc.close();
	}

}
