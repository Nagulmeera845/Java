package Arrays_Practise;
//WAP to create an array string type and add some data by ip taken-
//-from scanner class
import java.util.Scanner;

public class Array_4 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter array size:");
     int size=sc.nextInt();
     String sNames[]=new String [size];//array creation
     for(int i=0;i<size;i++) //logic for size execution
     {
    	 sNames[i]=sc.next();
      }
     System.out.println("Array values are:");
     for(int j=0;j<size;j++)
     {
    	 System.out.println(sNames[j]);
     }
     sc.close();
	}

}
