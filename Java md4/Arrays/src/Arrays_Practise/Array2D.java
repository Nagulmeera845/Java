package Arrays_Practise;
import java.util.Scanner;
public class Array2D {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter row and coloumn");
    int rowsize=sc.nextInt(),colsize=sc.nextInt();
    int a[][]=new int[rowsize][colsize];
    for(int i=0;i<rowsize;i++) {
    	for(int j=0;j<colsize;j++) {
    		a[i][j]=sc.nextInt();
       	}
    }
    for(int i=0;i<rowsize;i++) {
    	for(int j=0;j<colsize;j++) {
    		System.out.println(a[i][j]+" ");
    	}
	}
System.out.println();
}
}