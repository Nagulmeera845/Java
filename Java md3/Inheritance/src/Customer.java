class Zomoto{
	public  void getrestaurent(){
		System.out.println("sort as per location");
	}
}
class Cust extends Zomoto {
	public void getRestaurent() {
		System.out.println("Sort as per ratings and review ");
	}
}

public class Customer {
	public static void main (String args []) {
		Cust a1=new Cust();
		
		a1.getRestaurent();
		
	}

}
