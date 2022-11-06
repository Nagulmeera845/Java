package Strings_Progms;
//WAP to print alternae characters from given string
public class Progm_2 {

	public static void main(String[] args) {
   String s1=new String("Java Development");
   int len=s1.length();//16
   for(int i=0;i<len;i=i+2) 
   {
	   char ch=s1.charAt(i);
	   System.out.print(ch);
   }
	}

}
