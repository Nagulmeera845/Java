package Day2;

public class Multiply {

	public static void main(String[] args) {
    for(int i=0;i<args.length;i++)
    {
    	int p=Integer.parseInt(args[i]);
    	for(int j=1;j<=10;j++) {
    		System.out.println(p+"*"+j+"="+(p*j));
    	}
    	System.out.println("***********************");
    }
	} 

}
