
public class Method_With_Args {
	// Area of Rect 
	public static void areaOfRec(int l,int b)
	{
		int area_rec=l*b;
		System.out.println(" Area of rect :"+ area_rec);
	}
	// Area of Circle
	public static void areaOfCir(int r) 
	{
		float area_Cir=3.14F*r*r;
		System.out.println(" Area of Circle : "+ area_Cir);
		
	}
	public static void main(String args [])
	{
		areaOfRec(6,8); areaOfCir(9);
	}

}
