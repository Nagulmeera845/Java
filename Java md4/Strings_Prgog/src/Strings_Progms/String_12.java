package Strings_Progms;
//wap to remove duplicate words from string 
public class String_12 {

	public static void main(String[] args) {

	    String s="we are happy we are want to be happy";
	    String str[]=s.split(" ");
	    for(int i=0;i<str.length;i++)
	    {
	    	int count=1;
	    	for(int j=i+1;j<str.length;j++) {
	    		if(str[i].equals(str[j]))
	    		{
	    	
	    		str[j]="remove"; //for duplicate word replace with remonve
	    		count++;
	    	}
	    }
	    
		if(str[i]!="remove")
		
	    	System.out.println(str[i]);
		}
		}
}


