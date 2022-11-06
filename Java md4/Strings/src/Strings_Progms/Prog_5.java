package Strings_Progms;
//WAP to reverse of a string by using scanner class
import java.util.Scanner;
public class Prog_5 {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String:");
    String s1=new String(sc.nextLine());
   	int len=s1.length(); 
   	String rev=" ";
   	for(int i=len-1;i>=0;i--)
   	{
   		char ch=s1.charAt(i);
   		rev=rev+ch;
   	}
   	System.out.println("Reverse of a string:"+rev);
    sc.close();    

	}

}
