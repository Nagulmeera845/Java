package Module1_Practice;
//prog to check group of prime number
import java.util.Scanner;
public class Group_of_prime {
	public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter From number:");
		    int fromnum=sc.nextInt();
		    System.out.println("Enter To number:");
		    int tonum=sc.nextInt();
		    for(int i=fromnum;i<=tonum;i++) {
		    	int count=0;
		    	for(int j=1;j<=i;j++) {
		    		if(i%j==0)
		    			count++;
		    }
		    if(count==2)
		    	System.out.println(i+":is prime number");
		    }	
		    sc.close();//to remove warning msg
	}
}
