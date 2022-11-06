package Strings_Progms;
//WAP to print count of words
public class Prog_7 {
	public static void main(String[] args) {
     String s1=new String("we are all software family");
     int len=s1.length();
     int count=1;
     for(int i=0;i<len;i++)
     {
    	 char ch=s1.charAt(i);
    	 if(ch==' ')
    		 count++;
     }
     System.out.println("Count of words:"+count);
	}

}
