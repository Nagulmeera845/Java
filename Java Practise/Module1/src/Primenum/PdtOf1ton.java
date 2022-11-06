package Primenum;
//Product of 1 to n  
import java.util.Scanner;

public class PdtOf1ton {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number:");
    int n=sc.nextInt();
    int pdt=1;
    for(int i=1;i<=n;i++)
    	pdt=pdt*i;//1*1,1*2,2*3
    System.out.println("Product of 1 to n is:"+pdt);
	}

}
