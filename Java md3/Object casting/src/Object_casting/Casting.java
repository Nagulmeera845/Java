package Object_casting;

class A{
	public void m1() {
		System.out.println("M1-method of A-class ");
	}
}
class B extends A{
	public void m2() {
		System.out.println("M2-method of B-class ");
	}
}

public class Casting {

	public static void main(String[] args) {
		// upcasting 
		A a1= new B();
		a1.m1();
		// downcasting 
		B b1 =(B) a1;
		b1.m1(); 
		b1.m2();

	}

}
