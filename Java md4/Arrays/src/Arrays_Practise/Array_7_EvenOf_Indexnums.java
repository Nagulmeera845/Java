package Arrays_Practise;
//WAP to create an array int  type and add some data by ip taken-
//-from scanner class & print only evenindexvalues
import java.util.Scanner;

public class Array_7_EvenOf_Indexnums {
    
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your size is:");
    int size=sc.nextInt();   //method of scanner
    System.out.println("Enter your lucky num's in array:");
    int m[]=new int[size];  //new array creation
    for(int i=0;i<size;i++) //logic for size execution
    {
    	m[i]=sc.nextInt();
    }
    System.out.println("Even index position of num's from array:");
    for(int j=0;j<size;j++)  //logic for printing
    {
    	if(j%2==0)       //logic for finding of Evenindexpostion
    	System.out.println(m[j]);
    	sc.close();
    }
	}

}
// refer notes then you'll get full clarity