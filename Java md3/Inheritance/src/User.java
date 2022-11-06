
class A_7{
	public A_7() {
		System.out.println("A-constructor");
	}
}
class B_7 extends A_7{
	public B_7() {
		super();
		System.out.println("B-constructor");
}
}
class C_7 extends B_7{
	public C_7() {
		super();
		System.out.println("C-constructor");
	}
}


public class User {
	public static void main (String args []) {
		C_7 c1=new C_7();
		
	}
	

}
