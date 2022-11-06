package Finally_Block;

public class Sample_3 {

	public static void main(String[] args) {
    System.out.println("Main starts");
    int a=100,b=0,c;
    try {
    	c=a/b;
    }
    finally {
    	System.out.println("Finally block");
    }
    System.out.println("Main Ends");
	}

}
