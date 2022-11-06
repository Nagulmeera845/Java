
public class Method_with_Return_type {
	public static int areaOfRect(int l,int b)
	{
		return l*b;
	}
	public static float areaOfCir(int r)
	{
		return 3.14f*r*r;
	}
	public static void main(String args [])
	{
		int a=areaOfRect(10,20);
		System.out.println(a);
		float b=areaOfCir(5);
		System.out.println(b);
	}

}
