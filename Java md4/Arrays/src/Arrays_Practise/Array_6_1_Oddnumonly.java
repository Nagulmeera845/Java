package Arrays_Practise;
//WAP to create an array int  type and add some data by ip taken-
//-from scanner class & print odd values only 
import java.util.Scanner;

public class Array_6_1_Oddnumonly {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your array size is:");
    int size=sc.nextInt();
    System.out.println("Enter your array num's:");
    int n[]=new int[size];
    for(int i=0;i<size;i++)
    {
    	n[i]=sc.nextInt();
    }
    System.out.println("odd num's from array is:");
    for(int j=0;j<size;j++)
    {
    	if(n[j]%2!=0)
    		System.out.println(n[j]);
    	sc.close();
    }
    
	}

}
