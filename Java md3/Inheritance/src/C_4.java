// 4
class A_4 {
public A_4 (int i) {
	System.out.println("A-class constructor");
}
}
class B_4 extends A_4{
	public B_4(){
		super(10000);
		System.out.println("B-class constructor");
	}
}
public class C_4{
public static void main(String args []) {
	B_4 b1=new B_4();
}
}
