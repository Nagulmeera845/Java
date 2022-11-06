package Strings_Progms;

public class String_9 {

	public static void main(String[] args) {
     
		String s=" we love our  college life";
		String str[]=s.split(" ");
		String max=str[0];
		
		for(int i=0;i<str.length;i++)
			if(str[i].length()>max.length())
				max=str[i];
		System.out.println("Longest word is:"+max);
	}

}
