// 5
 class A_5 {
public A_5(int i) {
	System.out.println("A-class constructor with arguments");
}
public A_5() {
	this (50000);
	System.out.println("A-class constructor");
		 
	 }
 }
 class B_5 extends A_5{
	 public B_5() {
		 this (10000);
		 System.out.println("B-class constructor");
	 }
	 public B_5(int i) {
		// super()
		 System.out.println("B-class constructor with args");
	 }
 }
 public class C_5{
 public static void main(String args []) {
	B_5 b1=new B_5();
 }
 }
