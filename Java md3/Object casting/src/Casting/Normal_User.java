package Casting;
class Student_1{
	public void Viewing() {
		System.out.println("yes");
	}
}
class Admin_1 extends Student_1{
	public void Editing() {
		System.out.println("Yes");
	}
}

public class Normal_User {

	public static void main(String[] args) {
		Student_1 s1=new Admin_1(); //upcasting
		s1.Viewing(); 
		Admin_1 a1=(Admin_1) s1;   //downcasting
		a1.Viewing();
		a1.Editing();

	}

}
