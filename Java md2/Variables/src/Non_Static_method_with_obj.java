// Non static method
public class Non_Static_method_with_obj {
	//Non static method
	public void add()
	{
		System.out.println(200+300);
	}
	public static void main(String args[])
	{
		// classname referencevar=new classname
		Non_Static_method_with_obj s1=new Non_Static_method_with_obj();
		s1.add();
				
		
	}

}
