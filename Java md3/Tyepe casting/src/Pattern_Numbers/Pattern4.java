package Pattern_Numbers;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=4;row++) {
			for(int col=1;col<=4;col++) {
				if(row>=col)
					System.out.print(col);
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
