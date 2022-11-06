package Finally_Block;

public class Sample_2 {

	public static void main(String[] args) {
    System.out.println("Main Start");
    int a=100,b=0,c;
    try {
    c=a/b;
    }
    catch(ArithmeticException e) {
    System.out.println("Exception Caught");
    }
    finally {
    System.out.println("Finally block");
    }
    System.out.println("Main ends");
	}

}
