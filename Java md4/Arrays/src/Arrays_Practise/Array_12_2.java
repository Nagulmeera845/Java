package Arrays_Practise;
//WAP diff b/w max&min number from an array by scanner
import java.util.Scanner;

public class Array_12_2 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);//Scanner object
    System.out.println("Enter array size:");
    int size=sc.nextInt();//scanner method
    System.out.println("Enter your lucky num's: ");
    int a[]=new int[size];// array create
    for(int i=0;i<size;i++)// logic for array size execution
    {
    	a[i]=sc.nextInt();
    }
    int max=a[0],min=a[0];// assumptions
    for(int i=0;i<a.length;i++) //logic for printing
    {
    	if(a[i]>max)  //for finding max
    		max=a[i]; 
    	else if(a[i]<min)// for min value
    		min=a[i];
    }
    int diff=max-min; // for finding diff
    System.out.println("Maximum num from array is :" +max);
    System.out.println("Minimum num from array is :"+min);
    System.out.println("Diff b/w "+max+"-"+min+" is :"+diff);
    sc.close();
  
	}

}
