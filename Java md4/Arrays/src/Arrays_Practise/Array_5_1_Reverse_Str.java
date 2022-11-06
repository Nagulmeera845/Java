package Arrays_Practise;

import java.util.Scanner;

public class Array_5_1_Reverse_Str {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your array size:");
     int size=sc.nextInt();  //method of scanner
     System.out.println("Enter your favourite names:");
     String s[]=new String[size];  //array creation
     for(int i=0;i<size;i++)  //logic for array size execution 
     {
    	 s[i]=sc.next();
     }
     System.out.println("Reverse of array names:");
     for(int j=size-1;j>=0;j--) //logic for printing&reverse of string names
     {
    	 System.out.println(s[j]);
    	 sc.close();
     }
     
	}

}
