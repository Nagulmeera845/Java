package Module1_Practice;

public class Sum_Of_even {

	public static void main(String[] args) {
    int sum=0;
   for(int i=10;i<=20;i++) {
	   if(i%2==0)
		   sum=sum+i;
   }
   System.out.println("Sum of even is:"+sum);
	}

}
