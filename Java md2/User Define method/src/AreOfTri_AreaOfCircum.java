
public class AreOfTri_AreaOfCircum {

	// area of tri 
	public static void areaOfTri(int b, int h)
	{
		float area_Tri=0.5f*b*h;
		System.out.println("Area of tri : " + area_Tri);
	}
	// area of circum
	public static void areaOfCircum(int r)
	{
		float area_Circum=2*3.14f*r;
		System.out.println("Area of Circumference : "+ area_Circum);
	}
	public static void main (String args [])
	{
		areaOfTri(7,10);     areaOfCircum(6);
		areaOfTri(20,25);    areaOfCircum(10);
		areaOfTri(45,35);     areaOfCircum(20);
	}
}
