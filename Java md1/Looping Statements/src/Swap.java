
public class Swap {

	public static void main(String[] args) {

		int a=10,b=20,c;
		System.out.println(" BEFORE SWAP " + a+ "  " + b+ "  ");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(" AFTER SWAP : " +a+ "  "+ b+ "  ");
	}

}
