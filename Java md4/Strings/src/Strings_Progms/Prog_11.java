package Strings_Progms;
//WAP to count palindromesin a given string
public class Prog_11 {

	public static void main(String[] args) {

	    int count=0;
	    String s="madam is on high level";
	    String str[]=s.split(" ");
	    for(String w: str )
	    {
	    	String word=w,rev="";
	    	for(int i=word.length()-1;i>=0;i--)
	    	{
	    		char ch=word.charAt(i);
	    		rev=rev+ch;
	       	}
	    	if(rev.equals(word))
	    	{
	    		count++;
	    	}
	    }
	    System.out.println("Total no of palindromes is :"+count);
		
	}
	
}
