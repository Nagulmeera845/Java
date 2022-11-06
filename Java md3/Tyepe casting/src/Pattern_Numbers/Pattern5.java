package Pattern_Numbers;

public class Pattern5 {

	public static void main(String[] args) {
		int temp=1;
		// TODO Auto-generated method stub
       for(int row=1; row<=4;row++) {
    	   for(int col=1;col<=4;col++) {
    		   if(row==col||col<=row) {
    			   System.out.print(temp+" ");
    		       temp++;
    		   }
    		       else {
    		       System.out.print(" ");
    	   }
    	   }
    	   System.out.println();
       }
	}

}
