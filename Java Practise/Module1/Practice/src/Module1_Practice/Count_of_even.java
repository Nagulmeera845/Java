package Module1_Practice;

import java.util.Scanner;

public class Count_of_even {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
    int count=0;
    for(int i=1;i<=num;i++) {
    	if(i%2==0)
    		count++;
    }
    System.out.println("Count of even numbers from 1 to "+num+" is :"+count);
	}

}
