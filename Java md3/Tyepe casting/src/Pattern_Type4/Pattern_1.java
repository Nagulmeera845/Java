package Pattern_Type4;
public class Pattern_1{
	public static void main(String args []) {
		int star=1,space=3;//see first row
		for(int row=1;row<=4;row++) {
			for(int i=1;i<=space;i++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			star=star+2;
			space=space-1;
			
		}
	}
}