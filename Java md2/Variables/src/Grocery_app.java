
public class Grocery_app {
	static String itemname="bag", brand="Fastrack";
	int amount =500,quantity=1;
	public static void Customer_order()
	{
		System.out.println(itemname);
		System.out.println(brand);
		Grocery_app s1=new Grocery_app();//obj
		System.out.println(s1.amount);
		System.out.println(s1.quantity);
	
	}
	public void delivery_partner()
	{
		int mask_charges=50, sanitise_charges=50;
		System.out.println(mask_charges);
		System.out.println(sanitise_charges);
	}
	public static void main(String args [])
	{
		Customer_order();
		Grocery_app s2=new Grocery_app();  // obj 
		s2.delivery_partner();
		
	}

}
