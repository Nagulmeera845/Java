
public class Areas_Of_Tri_Circum {
	
	
	public static void areaOfTri ()
	{
		int b=10,h=15;
		float area_T=0.5F*b*h;
		System.out.println(" Area of Tri : "+ area_T);
	}
	public static void areaOfCircum()
	{
		int r=8;
		float circum=2*3.14F*r;
		System.out.println(" Area of Circumference circle :" + circum);
		
	}
	public static void main (String args [])
	{
		areaOfTri();
		areaOfCircum();
	}
	
}
