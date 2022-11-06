package Collections.Progs;

import java.util.ArrayList;
import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		ArrayList <Long> a1=new ArrayList<>();
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter size of ArrayList:");
		  int n=sc.nextInt();
		  for(int i=0;i<n;i++) {
			  System.out.println("Enter object at:"+i+"index");
			  a1.add(sc.nextLong());
		  }
		  sc.close();
		  for(int j=0;j<n;j++)//for printing 
			  System.out.print(a1.get(j));
	}

}
