// Multi-level inheritance  
// one gp
// one parent 
// one child
 class Animal_2 {
	public void eat()
	{
		System.out.println("Animal eats ");
	}
 }
	class Dog_2 extends Animal_2
	{
		public void bark(){
			System.out.println("Dog barks");
		}
	}
	class Cat extends Dog_2{
		public void meow() {
			System.out.println("Cat meow's");
	}
  }
	public class Forest_2{
		public static void main(String args []) {
			Cat  d1=new Cat();
			d1.eat();
			d1.bark();
	        d1.meow();
			
		}
	}
