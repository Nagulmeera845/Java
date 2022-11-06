package Pattern_Type3;

public class Pattern_7 {

	public static void main(String[] args) {
       char temp='A';
		for(char row='A';row<='D';row++) {
			for(char col='A';col<='D';col++) {
				if(row==col||col<=row) {
					System.out.print(temp+" ");
					temp++;
				}
					else {
						System.out.print(" ");
				}}
			System.out.println();
			}
		}
	}


