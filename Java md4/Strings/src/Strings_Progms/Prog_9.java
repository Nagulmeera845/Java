package Strings_Progms;
//WAP to print longest word from a  given string
public class Prog_9 {

	public static void main(String[] args) {
     String s="We love our college days";
     String str[]=s.split(" ");
     String max=str[0];
     for(int i=1;i<str.length;i++)
     {
    	 if(str[i].length()>max.length())
    		 max=str[i];
     }
     System.out.println(max);
	}

}
