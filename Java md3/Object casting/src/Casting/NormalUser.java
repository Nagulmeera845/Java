package Casting;

class Student{
	public void View() {
		System.out.println("View details app");
	}
}
class Admin extends Student{
	public void edit() {
		System.out.println("Edit details in app");
	}
}
class Corporate extends Admin{
	public void delete() {
		System.out.println("Delete data permanently");
	}
}

public class NormalUser {

	public static void main(String[] args) {
		
		Student  s1=new Admin();  //upcasted
		s1.View();
		Admin a1=(Admin) s1;      //downcasted
		a1.View();    a1.edit();
		Admin a2=new Corporate();  //upcasted
		a2.View(); a2.edit();
		Corporate c1= (Corporate)  a2;  //downcasted
		c1.View ();   a1.edit(); c1.delete();
		

	}

}
