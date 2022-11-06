
public class Reverse_of_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i=123,rem=0,rev=0;
      while(i>0)
      {
    	  rem=i%10;
    	  i=i/10;
    	  rev=rev*10+rem;
    	  
      }
      System.out.println(" Reverse of a given num is : "+ rev);
	}

}
