package Module1_Practice;

public class Palindrome_num {

	public static void main(String[] args) {
   int num=121,rem=0,rev=0,temp=num;
   while(num>0) {
	   rem=num%10;
	   num=num/10;
	   rev=rev*10+rem;
   }
   if(temp==rev)
	   System.out.println(temp+" : Palindrome number:");
   else
	   System.out.println(temp+" : Non-Palindrome number");
	}

}
