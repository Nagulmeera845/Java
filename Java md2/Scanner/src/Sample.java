import java.util.Scanner;
public class Sample {
	public static void main(String args [])
	{
		System.out.println("Enter your name");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println(name);
		System.out.println("enter gender code: ");
		char gender=sc.next().charAt(0);
		System.out.println(gender);
	}

}
