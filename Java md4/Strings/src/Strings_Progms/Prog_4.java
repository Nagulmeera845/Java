package Strings_Progms;
//WAP to print vowels from string by using scanner class&also make count of it
import java.util.Scanner;
public class Prog_4 {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string:");
    String s1=new String(sc.nextLine());
    int len=s1.length(),count=0;
    for(int i=0;i<len;i++) {
    	char ch=s1.charAt(i);
    	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    		count++;
    }
    System.out.println("Total no.of vowels:"+count);
    sc.close();
	}

	
}
