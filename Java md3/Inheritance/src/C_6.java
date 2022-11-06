// 5.1
class A_6 {
	public A_6 (int i) {
		System.out.println("A-class constructor with args");
	}
	public A_6(){
		this (50000);
		System.out.println("A-class constructor");
	}

}
class B_6 extends A_6{
	public B_6() {
		// super()
		System.out.println("B-class constructor with arguments");
	}
	public B_6(int i) {
		this ();
		System.out.println("B-class constructor");
	}
}
public class C_6{
	public static void main(String args []) {
		B_6 b1= new B_6(10000);
	}
}