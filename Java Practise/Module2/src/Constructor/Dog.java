package Constructor;
public class Dog {
	String Dname;
	public Dog() { //it doesn't return any value/returntype
		// classname & constructor name should be same
     //Default constructor or without args
	 Dname = "Tom";
	}
	public static void main(String[] args) {
 // classname ref=new constructorname();
       Dog d1=new Dog();
       System.out.println(d1.Dname);//Tom
  //Disadvantage :     
 // here we create other obj we get same value/result/Op bcoz consrucor no args      
       Dog d2=new Dog();
       System.out.println(d2.Dname);//Tom
		
	}
	

}
