
public class Book {
	String Bookname,Bookcolour;int pages;
	public Book(String Bname,String Bcolour,int Pages)
	{
		Bookname=Bname;
		Bookcolour=Bcolour;
		pages=Pages;
	}
	public static void main(String args [])
	{
		Book b1=new Book("SM","Grey",380);
		System.out.println(b1.Bookname+" "+b1.Bookcolour+" "+ b1.pages);
		Book b2=new Book("FM","white",500);
		System.out.println(b2.Bookname+" "+b2.Bookcolour+" "+ b2.pages);
		Book b3=new Book("Surveying","Pink",555);
	    System.out.println(b3.Bookname+" "+b3.Bookcolour+" "+ b3.pages);
	    Book b4=new Book("M-3","Red",545);
	    System.out.println(b4.Bookname+" "+b4.Bookcolour+" "+ b4.pages);
	}
}
