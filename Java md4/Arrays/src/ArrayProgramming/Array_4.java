package ArrayProgramming;
// Array of String type & by ip from user by using Scanner class
import java.util.Scanner;

public class Array_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		System.out.println("Enter some array values:");
		String s[] = new String[size];
		for(int i=0;i<size;i++) //logic for executing array size
		{    //i,j are indexes means 0,1,2.......n
			s[i]=sc.next();
			//s[i] is value@index
		}
		System.out.println("Array values are: ");
		for(int j=0;j<size;j++)  //logic for array values execution
		{
			System.out.println(s[j]);
			//s[j] is value@index
			sc.close();
		}
     
	}

}
