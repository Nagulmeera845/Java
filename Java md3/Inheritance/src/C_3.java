// 3
class A_3 {
	public A_3(int i) {
		System.out.println("A-class constructor");
	}
}
class B_3 extends A_3{
	public B_3(){
		// default super()
		System.out.println("B-class constructor");
	}
}
public class C_3{
	public static void main(String args []) {
		B_3 b1= new B_3();
	}
}
