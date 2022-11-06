package Arrays_Practise;
//WAP to print the min num from an array by using below userdefine method
import java.util.Scanner;

public class Array_10 {

	public static void min(int a[]) //userdefine method
	{ 
		int min=a[0];//Assumption
		for(int i=1;i<a.length;i++) //logic 
		{
			if(a[i]<min)// compare a[i] with min value
				min=a[i]; //to store a[i] into min var
		}
	
	System.out.println("Minimum num from array :"+min);
	}
		public static void main(String [] args) {
			Scanner sc=new Scanner(System.in);//Scanner object
			System.out.println("Enter array size:");
			int size=sc.nextInt();//scanner method
			System.out.println("Enter random num's:");
			int a[]=new int[size];//array creation
			for(int i=0;i<size;i++) //logic for size execution
			{
				a[i]=sc.nextInt();
			}
			min(a);// call to userdefine method 
		sc.close();
   
	}

}
// i,j are indexes
//a[i],a[j] are value @index