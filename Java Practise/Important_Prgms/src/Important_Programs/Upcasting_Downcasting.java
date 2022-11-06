package Important_Programs;

	class A{ //parent or super-class
		public void m1() {
			System.out.println("A-class m1 method");
		}
	}
	   class B extends A{  //child or  sub-class
		public void m2() {
			System.out.println("B-class m2 method");
		}
	   }
	  public class Upcasting_Downcasting {
	   public static void main(String[] args) {
		

		 A a1=new B(); //upcasting->only parent properties visible
	     B b1=(B) a1;  //downcasting->both parent& child visible
	     a1.m1();
	     b1.m1();
	     b1.m2();
	   
	  }}

