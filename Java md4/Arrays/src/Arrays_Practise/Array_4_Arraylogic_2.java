package Arrays_Practise;
//WAP to create an array string type and add some data by ip taken-
//-from scanner class
import java.util.Scanner;

public class Array_4_Arraylogic_2 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your array size:");
    int size=sc.nextInt();//'nextInt'method of scanner
    System.out.println("Enter anythng:");
    String Anythng[]=new String[size];//array creation
    
    for(int i=0;i<size;i++)////index position always start from zero &
   	 // here i'm taken index postion also from 0
    {
    	Anythng[i]=sc.next();
    }
    System.out.println("your array values are :");
    for(int j=1;j<size;j++) //here i'm in printing i take only from 1st position
    	         // '0' position index is not printed
    	// this is string na so i can take anything 
    {
    	System.out.println(Anythng[j]);
    	sc.close();  //method of scanner class
    }
    
	}

}
