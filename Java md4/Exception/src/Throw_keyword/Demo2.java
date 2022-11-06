package Throw_keyword;

public class Demo2 {
	public static void Voting(int age) throws ArithmeticException{
		if(age<=18) {
			throw new ArithmeticException("U r under age");
		}
		else {
			System.out.println("Eligibele");
		}
	}
	public static void main(String args[]) {
		try {
		    Voting(17);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled by caller");
		}
	}

}
