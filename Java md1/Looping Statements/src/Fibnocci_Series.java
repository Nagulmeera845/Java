
public class Fibnocci_Series {

	public static void main(String[] args) {
		//  A Series of numbers whose first two terms are 0  and third term is sum of previous two numbers.
		
		int a=0,b=1,c;
		
		System.out.print(a+ "  "+b+ "  ");
		for(int i= 1;i<=7;i++)
		{
			c=a+b;
			System.out.print(c+"  ");
			a=b;
			b=c;
		}

	}

}
