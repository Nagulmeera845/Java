package Strings_Progms;
//WAP to reverse a string by scanner
import java.util.Scanner;

public class Progm_5 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string:");
    String s1=new String(sc.nextLine());
      int len=s1.length();
       String rev="";
       for(int i=len-1;i>=0;i--)
      {
    	char ch=s1.charAt(i);
    	rev=rev+ch;  //""+''
    	
      }
    System.out.println("Reverse of string :" +rev);
    sc.close();
	}

}
