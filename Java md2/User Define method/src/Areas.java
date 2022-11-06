
public class Areas {
	 // method without arguments(inputs)
	public static void main(String args[]) {
		
		areaOfRec();
		areaOfSq();
		areaOfCir();
	
	}
	public static void areaOfRec()
	{
		int l=7,b=6,area_R;
		area_R=l*b;
		System.out.println("AREA OF RECTANGLE : " + area_R);
	}
	// Area of Square
	public static void areaOfSq()
	{
		int s=7,area_S;
		area_S=s*s;
		System.out.println(" AREA OF SQ : "+ area_S);
	}
	// Area of Circle
	public static void areaOfCir()
	{
		int r =5;
		float pie=3.14F,area_C;
		area_C=pie*r*r;
		System.out.println(" AREA OF CIR :" + area_C);
		
	}
	

}
