package Handling_Exception;

public class Sample_4 {

	public static void main(String[] args) {
    System.out.println("Main Starts");
    int a=100,b=0,c;
    try
    {
    System.out.println("Try Starts");
    c=a/b;//abnormal or unexpected statements
    System.out.println("Try Ends"); //unexecuted
    }
    catch(ArithmeticException e)
    {
    System.out.println("Exception is caught");
    }
    System.out.println("Main Ends");
	}

}
