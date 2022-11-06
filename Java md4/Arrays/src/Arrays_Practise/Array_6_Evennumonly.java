package Arrays_Practise;
//WAP to create an array int  type and add some data by ip taken-
//-from scanner class & print even values only 
import java.util.Scanner;

public class Array_6_Evennumonly {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of array:");
     int size=sc.nextInt(); //scanner method
     System.out.println("Enter your array num's:");
     int a[]=new int[size]; //array creation
     for(int i=0;i<size;i++) //logic for array size
     {
    	 a[i]=sc.nextInt();
     }
     System.out.println("Even num's from array:");
     for(int j=0;j<size;j++)  //logic for printing
     {
    	 if(a[j]%2==0)  //logic for finding of evennum
    		 System.out.println(a[j]);
    	 sc.close();
     }
	}

}
