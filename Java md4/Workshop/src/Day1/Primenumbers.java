package Day1;

public class Primenumbers {

	public static void main(String[] args) {
    int n=Integer.parseInt(args[0]);
    for(int i=1;i<=n;i++) {
    	int count=0;
    	for(int j=1;j<=i;j++) {
    		if(i%j==0)
    			count++;
    	}
    	if(count==2)
    		System.out.println( i+" : primenumber");
    }
	}

}
