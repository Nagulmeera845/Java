package Module1_Practice;

import java.util.Scanner;

public class Sum_Pdt_Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    System.out.println("Enter number:");
    int num=sc.nextInt();
	int count=0,sum=0,pdt=1;
	for(int i=1;i<=num;i++) {
		if(i%2!=0) {
	    count++;
		sum=sum+i;
		pdt=pdt*i;
	}}
	System.out.println("Count of odd numbers from 1 to "+num+" is:"+count);
	System.out.println("Sum of odd numbers from 1 to "+num+" is:"+sum);
	System.out.println("Product of odd numbers from 1 to "+num+" is:"+pdt);
	
	}

}
