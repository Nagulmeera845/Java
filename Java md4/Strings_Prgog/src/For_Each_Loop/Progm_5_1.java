package For_Each_Loop;
//wap to count duplicate words and count it
public class Progm_5_1 {

	public static void main(String[] args) {
    String s="madam is on high level madam level is peek level";
    String str[]=s.split(" ");
    for(int i=0;i<str.length;i++)
    {
    	int count=1;
    for(int j=i+1;j<str.length;j++)
    {
    	if(str[i].equals(str[j]))
    	{
    		str[j]="remove";
    	count++;
    }
    	}
	if(str[i]!="remove" && count>1)
    	System.out.println(str[i]+"-"+count);
	}
	}
}
