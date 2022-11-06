
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num =121, rem=0,rev=0,temp=num;
    while(num>0)
    {
	rem=num%10;
	num=num/10;
	rev=rev*10+rem;
	}
     if(temp==rev)
    	 System.out.println(temp+ "  is a palindrome number");
     else
    	 System.out.println(temp+ " is non palindrome");
	}

}
