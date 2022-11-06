package Arrays_Practise;
//WAP diff b/w max&min number from an array by userdefine method
import java.util.Scanner;

public class Array_12 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your array:");
     int size=sc.nextInt();    //scanner method
     int a[]=new int[size];   //array creation
     for(int i=0;i<size;i++) //logic for array size execution 
     {
    	 a[i]=sc.nextInt();
   	}
	maxminDiff(a); //call to userdefine method
	sc.close();
	}
     public static void maxminDiff(int a[])//userdefine method
     {
    	 int max=a[0],min=a[0]; //Assumptions
    	 for(int i=1;i<a.length;i++) //logic for printing
    	 {
    		 if(a[i]>max)  //for find max value
    			 max=a[i]; 
    		 else if(a[i]<min) //for find min vaue
    			 min=a[i];
    	 }
    		 System.out.println("Maximum from array :"+max);
    		 System.out.println("Minimum from array :"+min);
    	     int diff=max-min;
    		 System.out.println("Difference b/w :"+max+"-"+min+"="+diff);
    	 
     }


}