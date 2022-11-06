
public class FoodOrderApp {
	static String rest_name="Meridian";
    static  int price=999,no_dishes=1;
	int Order_id=1221,dis_amt=100;
	public static void Order_Details()
	{
		System.out.println(rest_name);
		System.out.println(price);
		System.out.println(no_dishes);
		FoodOrderApp n1=new FoodOrderApp();
		System.out.println(n1.Order_id);
		System.out.println(n1.dis_amt);
	}
	public void Delivery_Person(String Address,int wait_charges)
	{
		System.out.println(Address);
		System.out.println(wait_charges);
		Order_Details();
	}
	public void zomoto_partner()
	{
		int Food_rating=10,delivery_rating=10,hygenic_rating=10;
		System.out.println(Food_rating);
		System.out.println(delivery_rating);
		System.out.println(hygenic_rating);
		Delivery_Person("KPHB, Phase-2, HYD ", 50 );
	}
	public static void main(String args [])
	{
		FoodOrderApp n2=new FoodOrderApp();
		n2.zomoto_partner();
	}
}
