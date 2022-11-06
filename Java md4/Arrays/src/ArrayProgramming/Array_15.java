package ArrayProgramming;
//Ascending order

//Scanner class is present in java.utilPackage
import java.util.Scanner;
//class name
public class Array_15 {
	public static void main(String[] args) { //main metod
 //Scanner obj: reading ip from user
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array size:");
    int size=sc.nextInt(); //method of Scanner class
    int a[]=new int[size]; //array creation
    for(int i=0;i<size;i++)// for execution of array size
    {
    	a[i]=sc.nextInt();
    }
    System.out.println("Sorting values:");
    int temp=0;// extra var for swapping
    for(int i=0;i<a.length;i++) //for sorting 
    {
    	for(int j=0;j<a.length-1;j++)// for sorting refer to next index position
    	{
    		if(a[j]>a[j+1])  //25>24 //24>15 // 15>3 // 3>9 // 9>45
    		{ //for swapping
    			temp=a[j];   //0=24 /
    			a[j]=a[j+1]; //24=15
    			a[j+1]=temp;//3=24
    		}
    	}
    }
    //printing after sorting
    for(int k=0;k<size;k++)
    {
    	System.out.println(a[k]);
    	sc.close();//method of scanner
    }
	}

}
