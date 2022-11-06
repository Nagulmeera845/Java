package Handling_Exception;

public class Sample_5 {

	public static void main(String[] args) {
    System.out.println("Main Starts");
    int a=100,b=0,c;
    try
    {
    c=a/b;//Arithmetic Exception
    Sample_5 s=(Sample_5) new Object();//classcast Exception
    //downcasting=converting parent class object into child class object
    }
    catch(ArithmeticException e) 
    {
    System.out.println("Exception is caught");
    }
    System.out.println("Main Ends");
	}

}
