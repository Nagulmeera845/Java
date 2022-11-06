
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num=153; int rem,arm=0,temp=num;
      while(num>0)
      {
    	rem=num%10;
    	num=num/10;
    	arm=arm+rem*rem*rem;
    	
      }
      if(temp==arm)
    	  System.out.println(temp +" is a Armsstrong number ");
      else
    	  System.out.println(temp + " is not Armstrong number ");
	}

}
