// Super()
class A {
	public A() {
		System.out.println("A-class constructor");
	}

}
class B extends A  {
	public B() {
		super();
		System.out.println("B-class constructor");
	}
}
public class C_1{
	public static void main (String args []) {
		B b1= new B();
	}
}
