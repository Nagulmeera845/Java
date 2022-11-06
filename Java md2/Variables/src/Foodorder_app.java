// Non static var and method
public class Foodorder_app {

	static String Rest_name="KMM City Haveli";
	static int no_of_dishes=15;
	static int price=200;
	int order_id=12345;
	int discount_amt=100;
	
	public static void Order_details()
	{
		System.out.println("Restaurent name : " +Rest_name);
		System.out.println("no_of_dishes : " + no_of_dishes);
		System.out.println("price : " + price);
		Foodorder_app s1=new Foodorder_app();
		System.out.println("Order id : " + s1.order_id);
		System.out.println("discount amount : "+ s1.discount_amt);
	}
	public void delivery_person()
	{
		String address="khammam"; int waitng_chges=50;
		System.out.println("Address : " +address);
		System.out.println("waitng_chges : " + waitng_chges);
		Order_details();
	}
	public void Zomoto_partner()
	{
		int food_ratng=5,delivery_ratng=3,hygenic_ratng=2;
		System.out.println("food_ratng : "+ food_ratng);
		System.out.println("delivery_ratng : " +delivery_ratng);
		System.out.println("hygenic_ratng : " + hygenic_ratng);
		delivery_person();
	}
	public static void main(String args[])
	{
		Foodorder_app s2=new Foodorder_app();
		s2.Zomoto_partner();
		
	}
}
