package Strings_Progms;

public class Prog_16 {

	public static void main(String[] args) {
 String s="java development is easy";
 String i=s.toLowerCase();
 String j=s.toUpperCase();
 String k=s.concat("is easy");
 boolean l=s.contains("dev");
 String m=s.replace('a','b');
 String n=s.replaceAll("java","Python");//here what we are given ip 
             //then write here in this also same like ....
 ///Ip:java ->then write java----->correct
 ///Ip:java ->then write Java ------>wrong
 
 System.out.println(i+"\n"+j+"\n"+k+"\n"+l+"\n"+m+"\n"+n);
	}

}
