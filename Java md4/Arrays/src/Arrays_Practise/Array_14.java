package Arrays_Practise;
//WAP to print secondminimum from an array by using userdefinemethod 
import java.util.Scanner;

public class Array_14 {
	public static void secondMin(int a[]) {  //userdefinemethod
	int min=a[0],smin=a[0];  //Assumptions
	 
	 for(int i=0;i<a.length;i++)
	 {
		 if(a[i]<min) {
			 smin=min;
		 min=a[i];
		 }
		 else if(a[i]<smin) {
			 smin=a[i];
	 }
	 
	 }
	 
	 
	System.out.println("Minimum from array :"+min);
	System.out.println("Second min from array : "+smin);
	 }

		
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter array size:");
     int size=sc.nextInt(); 
     System.out.println("Enter some array values:");
     int a[]=new int [size];
     for(int j=0;j<size;j++)// logic for size execution 
     {
    	 a[j]=sc.nextInt();
     }
     secondMin(a);
     sc.close();
	}

}
