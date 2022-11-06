
class Normaluser{
	public void  Dailyshows (){
		System.out.println("Existing shows");
	}
}
class VipUser extends Normaluser{
	public void liveShow (){
		System.out.println("All live shows can be watched");
	}
	
}

 public class User {
	 public static void main(String args []) {
		Normaluser a1=new VipUser();
		a1.Dailyshows();
		VipUser a2 =(VipUser) a1;
		a2.Dailyshows();
		a2.liveShow();
		 
	 }

}
