package Throw_keyword;

public class Demo {

	public static void Voting (int age) {
      if(age<=18) {
    	  throw new ArithmeticException("U r under age");
      }
      else {
    	  System.out.println("Eligible");
      }
	}
      public static void main(String args[]) {
    	  Voting(12);
      
	}

}
