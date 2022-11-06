package Primenum;
//Using userdefine method
import java.util.Scanner;
public class FindPrime {
    public static void prime() {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number:");
    int num=sc.nextInt();int count=0;
    for(int i=1;i<=num;i++) {
    	if(num%i==0) {
    		count++;
    	}
    }
    if(count==2)
    System.out.println(num+":is a prime ");
    else
    System.out.println(num+":is not prime ");
    }
  	public static void main(String[] args) {
    prime();//calling userdefine method with mehod signature
    prime();
    prime();
 	}

}
