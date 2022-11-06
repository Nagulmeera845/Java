package Abstraction;
abstract class Fruit_2{
	abstract public void taste();
	abstract public void Price();
	abstract public void availability();
}
abstract class Mango_2 extends Fruit_2{
	public void taste() {
		System.out.println("Sweet");
	}
	public void Price() {
		System.out.println("As per season demand");
	}
}
class Summer_Mangoes extends Mango_2{
	public void availability() {
		System.out.println("Available till summer ends");
	}
}

public class User_2 {

	public static void main(String[] args) {

		 Fruit_2 f1=new  Summer_Mangoes();//upcasting
		 f1.taste();
		 f1.Price();
		 f1.availability();
	}

}
