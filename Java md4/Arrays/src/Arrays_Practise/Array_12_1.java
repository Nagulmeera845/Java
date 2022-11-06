package Arrays_Practise;
//WAP diff b/w max&min number from an array by userdefine method other method
import java.util.Scanner;

public class Array_12_1 {
	public static void maxminDiff(int a[])//userdefine
	{
		int max=a[0],min=a[0]; //Assumptions
		for(int i=0;i<a.length;i++) //logic for printing
		{
			if(a[i]>max) //for finding max value
				max=a[i];
			else if(a[i]<min) //for finding min value
				min=a[i];
		}
	
    System.out.println("Maximum from array :"+max);
    System.out.println("Minimum from array :"+min); 
    int diff=max-min;
    System.out.println("Diff b/w "+max+"-"+min+" is: ="+diff);
	}
	public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
     System.out.println("Enter your array size:");
     int size=sc.nextInt();
     System.out.println("Enter your favourite num's:");
     int a[]=new int[size];
     for(int i=0;i<size;i++)//logic for array size execution
     {
    	 a[i]=sc.nextInt();
     }
     maxminDiff(a);// calling userdefine method
     sc.close();
	}

}
