
public class Car {
String Carname,Carcolour;int price;
public Car(String Cname,String colour,int Cprice)
{
	Carname=Cname;
	Carcolour=colour;
	price=Cprice;
}
public static void main(String args [])
{
	Car c1=new Car("Audi","Black",3800000);
	System.out.println(c1.Carname+" "+c1.Carcolour+" "+ c1.price);
	Car c2=new Car("Nano","white",50000);
	System.out.println(c2.Carname+" "+c2.Carcolour+" "+ c2.price);
	
}
}
