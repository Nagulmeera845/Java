package Strings_Progms;
//WAP to remove duplicate words from string
public class Prog_12 {
	public static void main(String[] args) {
    String s="Madam is On high level Madam level is peek level";
	String str[]=s.split(" ");
    for(int i=0;i<str.length;i++) {
    	for(int j=i+1;j<str.length;j++) {
    	if(str[i].equals(str[j])) {
    		str[j]="remove";
    }
  }
    
	if(str[i]!="remove")
    	System.out.print(str[i]+" ");
    
	}
}
}