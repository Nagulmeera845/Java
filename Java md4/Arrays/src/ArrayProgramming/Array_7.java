package ArrayProgramming;
//Create array by  taking values from user and printing only-
//-even indexposition numbers
import java.util.Scanner;

public class Array_7 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Ener size of array: ");
     int size=sc.nextInt();
     int a[]=new int[size];
     for(int i=0;i<size;i++)
     {
    	 a[i]=sc.nextInt();
     }
     System.out.println("Even index positin numbers from given array  : ");
     for(int j=0;j<size;j++)
     {
    	 if(j%2==0)
    		 System.out.println(a[j]);
    	 sc.close();//metohd of scanner
     }
	}

}
