
public class Method_Overloading {
	
	public static void payment (String wallettype,String UID)
	{
		System.out.println(" Wallet type : " + wallettype);
		System.out.println(" UID type : " + UID);
	}
	public static void payment(String cardtype,long cardno,int cvvnumber)
	{
		System.out.println(" Card type : " + cardtype);
		System.out.println(" Card number : " + cardno);
		System.out.println(" CVV number  : " + cvvnumber);
	}
	public static void payment(String cardtype,String username,int pwd,long Accnum)
	{
		System.out.println(" CardType : "+ cardtype);
		System.out.println(" username : "+ username);
		System.out.println(" pwd : "+ pwd);
		System.out.println(" Accnum : "+ Accnum);
		
	}
	public static void  main(String args[])
	{
		payment(" googlepay ", "nagulmeera8451@ybl");
		payment(" Debit ",1234567899, 143);
		payment(" Debit card "," NAgul ",1290 ,123456789);
	}
	

}
