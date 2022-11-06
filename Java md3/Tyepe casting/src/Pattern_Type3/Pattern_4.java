package Pattern_Type3;

public class Pattern_4 {

	public static void main(String[] args) {

		char temp='A';
		for(char row='A';row<='D';row++) {
			for(char col='A';col<='C';col++) {
				System.out.print(temp+" ");
				temp++;
			}
			System.out.println();
		}
	}

}
