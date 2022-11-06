package Handling_Exception;

public class Sample_2 {

	public static void main(String[] args) {
    System.out.println("Main Starts");
    int a=100,b=0,c;
    try {
    	c=a/b;//abnormal or unexpected statement
    }
    catch(ArithmeticException e) {
    	System.out.println("Exception Caught");
    }
    System.out.println("Main Ends");
	}

}
