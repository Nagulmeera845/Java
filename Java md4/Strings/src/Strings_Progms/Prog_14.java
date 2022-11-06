package Strings_Progms;
//WAP simple program on index 
public class Prog_14 {
	public static void main(String[] args) {
     String s="Java develpment";
     int i=s.indexOf('a');//1
     int j=s.indexOf("dev");//5
     int k=s.indexOf('a',2);//3
     int l=s.indexOf("eve",4);//6
     int m=s.indexOf('Z');//-1  Note:IndexOf() returns -1 if char is not-
                             // -present in a string
     
     System.out.println(i+"\n"+j+"\n"+k+"\n"+l+"\n"+m);
	}

}
