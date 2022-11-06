package Primenum;
//Sum of 1 to n 
import java.util.Scanner;
public class SumOf1ton {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter num:");
    int n=sc.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++)
    	sum=sum+i;//0+1,1+2,3+3,6+4
    System.out.println("Sum of 1 to " +n+" is:"+sum);
	}

}
