package Day3;

public class Recursion {
	
	public static void rec(int i) {
		int num=i,rev=0,temp=num,rem;
		while(num>0) {
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		if(temp==rev) {
			System.out.println("Palindrome"+rev);
		}
		
			if(i<=1000) {
				i=i+1;
				rec(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       rec(1);
	}

}
