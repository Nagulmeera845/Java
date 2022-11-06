
public class Sum_of_evennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=23456789;int rem,sum=0;
     while (num>0)
     {
    	 rem=num%10;
    	 num=num/10;
    	 if(rem%2==0) {
    		 sum=sum+rem;
    	 }
    	 
     }
     System.out.println(" sum of even numbers is : " + sum );
	}

}
