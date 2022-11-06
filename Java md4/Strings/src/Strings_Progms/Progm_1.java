package Strings_Progms;

public class Progm_1 {

	public static void main(String[] args) {
    String s1=new String("Java Development");
    int len=s1.length(); //16
    for(int i=0;i<len;i++) //1<16
    {
    	char ch=s1.charAt(i);
    	System.out.println(ch); //j,a,.......
    }
	}

}
