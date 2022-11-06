package For_Each_Loop;
// Prog to remove duplicate words from string
public class Progm_5 {

	public static void main(String[] args) {
     String s="madam is on high level madam is peek level";
     String str[]=s.split(" ");
     for(int i=0;i<str.length;i++)
     {
    	 for(int j=i+1;j<str.length;j++)
    	 {
    		 if(str[i].equals(str[j]))
    			 str[j]="remove";
    	 }
    	 if(str[i]!="remove")
        System.out.println(str[i]);
     }
	}

}
