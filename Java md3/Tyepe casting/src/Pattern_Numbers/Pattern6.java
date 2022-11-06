package Pattern_Numbers;

public class Pattern6 {

	public static void main(String[] args) {

		int temp=1;
		for(int row=1;row<=4;row++) {
			for(int col =1;col<=3;col++) {
				System.out.print(temp+" ");
				temp++;
			}
			System.out.println();
		}
	}

}
