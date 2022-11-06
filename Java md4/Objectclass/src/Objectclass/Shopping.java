package Objectclass;

public class Shopping {
	String Pdtname,Brand,Colour;int Price;
	Shopping(String Pdtname,String Brand,String Colour,int Price){
		this.Pdtname=Pdtname;
		this.Brand=Brand;
		this.Colour=Colour;
		this.Price=Price;
		
	}
	public String toString() {
		return Pdtname+"\n"+Brand+"\n"+Colour;
	}
	public int hashcode() {
		return Price;
	}

	public static void main(String[] args) {
		Shopping s=new Shopping ("Watch","Fasttrack","Steel",96500);
		String a=s.toString();
		System.out.println(a);
		int d=s.hashcode();
		System.out.println(d);
     
	}

}
