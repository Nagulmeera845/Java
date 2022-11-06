package Pattern_Type4;

public class Pattern_7 {

	public static void main(String[] args) {

		int slash=1;
		for(int row=1;row<=4;row++) {
			for(int col=1;col<=4;col++) {
				if(row+col>=5)
					System.out.print("*");
				else{
					System.out.print(" ");
				}
			}
			for(int i=1;i<=slash;i++) {
				System.out.print("#");
			}
			System.out.println( );
			slash=slash+1;
		}
	}

}
