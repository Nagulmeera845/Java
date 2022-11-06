package Abstraction;
interface A{
	void m1();
}
	interface B{
	void m2();''
	}
	abstract interface C extends A,B
	{
    }
	class  D implements C{
		public void m1() {
			System.out.println("Nagulmeera");
		}
		public void m2() {
			System.out.println("Innocent");
		}
	}

public class Multipleinheritance_Through_Interface {

	public static void main(String[] args) {
     D d1=new D();
     d1.m1();
     d1.m2();
	}
}
	


