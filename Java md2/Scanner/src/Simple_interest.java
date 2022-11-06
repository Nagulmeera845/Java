// import statement
import java.util.Scanner;

public class Simple_interest {
	public static void main (String args [])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Amount");
		int p= sc.nextInt();
		System.out.println("Enter Time in years ");
		byte T= sc.nextByte();
		System.out.println(" Enter rate of interest ");
	    float r=sc.nextFloat();
	    float si=(p*T*r)/100;
	    System.out.println(" Simple interest : "+ si);
	    
		
		}

}
