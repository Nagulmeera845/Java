package Primenum;
//count of 1 to n numbers
import java.util.Scanner;

public class Count1ton {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter num");
    int n=sc.nextInt();
    int count=0;
    for(int i=1;i<=n;i++)
    	count=count+i;//0+1,1+2,3+3
    System.out.println("Count 1 to n is :"+count);
	}

}
