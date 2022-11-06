package For_Each_Loop;
// 8) WAP to count frequency of a particular word in a string
// IP: we are happy and we want to be happy
// IP2: happy
// OP: happy occurred2 times

public class Progm_2 {

	public static void main(String[] args) {
		
		String s="we are happy and we want to be happy";
		String str[]=s.split(" ");
		int count=0;
		for(String d: str)
        if(d.equals("are"))
        	count++;
		System.out.println("Count is:"+ count);
     
	}

}
