package Strings_Progms;
//WAP to removing characters from string
public class Prog_15 {
	public static void main(String[] args) {
    String s="java development is easy";
    String un=" ";
    for(int i=0;i<s.length();i++) {
    	char ch=s.charAt(i);
    	if(un.indexOf(ch)==-1) {
    		un=un+ch;
    	}
    }
    System.out.println("String without duplicate is:"+un+" ");
	}

}
