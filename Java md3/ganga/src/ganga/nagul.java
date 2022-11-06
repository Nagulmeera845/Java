package ganga;
class Normaluser{
	public void Dailyshow() {
		System.out.println("existing show");
	}
}
class Vipuser extends Normaluser{
	public void liveshow() {
		System.out.println("all live shows can be watched");
	}
}


public class nagul {

	public static void main(String[] args) {
		Normaluser a1=new Vipuser();
		a1.Dailyshow();
		Vipuser a2=(Vipuser) a1;
		a2.Dailyshow();
		a2.liveshow();	// TODO Auto-generated method stub

	}

}
