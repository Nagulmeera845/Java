
// import statement
import java.util.Scanner;
public class Personal_import {
	public static void main(String args []) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name=sc.nextLine();
		System.out.print(" Enter your id : ");
		int id=sc.nextInt();
		System.out.print(" Enter your age : ");
		byte age=sc.nextByte();
		System.out.print(" Enter your contact number : ");
		long cont=sc.nextLong();
		System.out.print("Enter your gender code :");
		char gender=sc.next().charAt(0);
		
	
		
		
		System.out.println("my name is : " + name);
		System.out.println("my id is : " + id);
		System.out.println("my age is : " + age);
		System.out.println("my cont num  is : " + cont );
		System.out.println("my gender is : "+ gender);
		
		
		
		
		}

}
