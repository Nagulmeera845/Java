package Handling_Exception;

public class Sample_3 {

	public static void main(String[] args) {
    System.out.println("Main Starts");
    int a=100,b=100,c;
    try {
    	c=a/b;
    }
    catch(ArithmeticException e)
    {
    System.out.println("Exception is caught");// not executed bcoz of no Excception
    }
    System.out.println("Main Ends");
	}

}
