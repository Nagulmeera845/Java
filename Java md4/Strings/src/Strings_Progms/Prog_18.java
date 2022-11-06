package Strings_Progms;
public class Prog_18 {
	public static void main(String[] args) {
   String s="Java development";
   s=s.toUpperCase();
   char ch[]=s.toCharArray();
   for(char k='A';k<='Z';k++)
   {
	   int count=0;
	   for(int i=0;i<ch.length;i++) {
		   if(k==ch[i])
			   count++;
	   }
	   if(count>0)
		   System.out.println(k+"-"+count);
   }
	}

}
