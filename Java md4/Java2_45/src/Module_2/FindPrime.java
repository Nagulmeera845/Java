package Module_2;

import java.util.Scanner;

public class FindPrime {
	public static void prime() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
	    }
	}
	if(count==2)
		System.out.println(num+": is prime number");
	else
		System.out.println(num+": is not prime number");
	sc.close();
	}
	public static void main(String[] args) {
      prime();
      prime();
     
      }
     }
  

