package Strings_Progms;
//WAP to check whether string is palindrome or not by using scanner
import java.util.Scanner;
public class Prog_6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		  System.out.println("Enter string:");
		    String s1=new String(sc.nextLine());
		    int len=s1.length();
		     String rev="";//here shouldn't give space
		     for(int i=len-1;i>=0;i--)
		    {
		  	char ch=s1.charAt(i);
		  	rev=rev+ch;
    }
    System.out.println("Reverse of string :" +rev);
    if (s1.equalsIgnoreCase(rev))
  	  System.out.println(rev+":is palindrome string");
    else
  	  System.out.println(rev+"is non palindrome string");
    sc.close();
	}
	}

