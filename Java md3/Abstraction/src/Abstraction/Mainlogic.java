package Abstraction;
interface Car{
	void Accelerate();// abstract public void accelerates
}
class Honda implements Car{ //instead of using extends use implements
	public void Accelerate() {
		System.out.println("As per latest design of honda");
	}
	
}

public class Mainlogic {

	public static void main(String[] args) {
    Car c1=new Honda();  //upcasting
    c1.Accelerate();
	}

}
