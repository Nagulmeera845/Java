package Finally_Block;

public class Sample {

	public static void main(String[] args) {
	System.out.println("Main start");
    int a=100,b=10,c;
    try {
    	c=a/b;
    }
    catch(ArithmeticException e){
    System.out.println("Exception caught");	
    }
    finally {
    System.out.println("Finally block");
    }
    System.out.println("Main Ends");
	}

}
