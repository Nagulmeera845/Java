
public class Sum_Even_10_to_20 {

	public static void main(String[] args) {

		int sum=0;
		for(int i=10;i<=20;i++) {
			if(i%2==0)
				sum=sum+i;
		}
			System.out.println("SUM OF EVEN NUMBERS FROM 10 TO 20 IS :" +sum);
		
	}

}
