// Single Inheritance 
// 1 parent 1 child
class Animal {
	public void eat()
	{
		System.out.println("Animal eats");
	}

}
 class Dog extends Animal
{
	public void bark()
	{
		System.out.println("dog barks");
	}
}
public class Forest
{
	public static void main(String args [])
	{
		Dog d1=new Dog ();
		d1.eat();
		d1.bark();
		
	}
}