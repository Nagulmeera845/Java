
public class Narrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d= 120.789874;
		float f=(float)d;
		long l= (long)f;
		int i= (int) l;
		short s= (short)i;
		byte b=(byte)s;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		

	}

}
