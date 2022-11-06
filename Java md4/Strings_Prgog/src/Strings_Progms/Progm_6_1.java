package Strings_Progms;
//count of words
import java.util.Scanner;

public class Progm_6_1 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string:");
    String s=sc.next();
    s=s.trim(); //to remove spaces from starting and ending
    String s1=new String(s);
    int len=s1.length(); //we are assuming that there is one word
    int count=1;
    for(int i=0;i<len;i++)
    {
    	if(s1.charAt(i)==' '&&s1.charAt(i+1)!=' ')
    		count++;
    }
    System.out.println(count);
    sc.close();
	}

}
