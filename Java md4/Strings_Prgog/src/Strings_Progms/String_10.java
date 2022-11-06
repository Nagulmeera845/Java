package Strings_Progms;
//WAP to reverse string word wise
public class String_10 {

	public static void main(String[] args) {
    String s="we love our school";
    String str[]=s.split(" ");
    int len=str.length;
    for(int i=len-1;i>=0;i--)
    	System.out.println(str[i]+" ");
	}

}
