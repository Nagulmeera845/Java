
class Whatsapp{
	public void readmessages()
	{
		System.out.println("if messages read,blue ticks will appear's");
	}
	public void dp() {
		System.out.println(" np profile picture");
	}
	public void calls() {
		System.out.println(" save contact then we can make call");
	}
}
class WhatsAppUser extends Whatsapp{
	public void readmessages() {
		System.out.println(" Hide blue ticks for other user");
	}
	public void dp() {
		System.out.println(" choose from my photos");
	}

}
public class User_1{
	public static void main(String args []) {
		WhatsAppUser u1=new WhatsAppUser();
		u1.readmessages();
		u1.calls();
		u1.dp();
	}
}
