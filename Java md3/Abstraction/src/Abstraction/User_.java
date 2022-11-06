package Abstraction;

abstract class Fruit{
	abstract public void taste();
	abstract public void Price();
	}
class Mango extends Fruit{
	public void taste() {
		System.out.println("Sweet");
	}
	public void Price() {
		System.out.println("As per season demand");
	}
}


public class User_ {

	public static void main(String[] args) {
		Fruit f1=new Mango();
		f1.taste();
		f1.Price();

		
	}

}
