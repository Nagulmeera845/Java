package For_Each_Loop;

public class Progm_12 {

	public static void main(String[] args) {
    String s="madam is on high level madam level is peek level";
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
