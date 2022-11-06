package Day3;

public class Armstrong_Recursion {
	public static void rec(int i) {
		int num=i,arm=0,temp=num,rem;
		while(num>0) {
			rem=num%10;
			num=num/10;
			arm=arm+rem*rem*rem;
		}
		if(temp==arm) {
			System.out.println("arm :"+arm);
		}
		if(i<=1000) {
			System.out.println(i);
			i=i+1;
			rec(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	rec(1);
	}
}
