package Constructor;
public class Car {
	String carname,carcolour;
    int carprice;  
    public Car(String cname,String colour,int price)//Parameterized /with args 
    {
	carname=cname;
	carcolour=colour;
	carprice=price;
    }
	public static void main(String[] args) {
		
// classname ref=new constructorname(args);
    Car c1=new Car("Audi","white",3200000); //giving values/args to ref 'c1'
    System.out.println(c1.carname+" "+c1.carcolour+" "+c1.carprice);
    Car c2=new Car("Nano","Red",2500000); //giving values/args to ref 'c2'
    System.out.println(c2.carname+" "+c2.carcolour+" "+c2.carprice);
	}

}
