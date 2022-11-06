package Encapsulation;

class Googlepay{
	private String Upi,Pwd;
	public void setUpi(String Upi) {
		this.Upi=Upi;
	}
	public void setPwd(String Pwd) {
		this.Pwd=Pwd;
	}
	public String getUpi() {
		if(Upi=="9515627845@ybi") 
			return "Valid Upi id";
		else 
			return"Invalid Upi id ";
		
	}
	public String getPwd() {
		if(Pwd=="Nagul@143")
			return "Valid Password";
	
	else 
	return "Invalid passwaord ";
}
}

public class UserGooglepay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Googlepay g1=new Googlepay();
		g1.setUpi("6300682178@sbi");
		g1.setPwd("Yasmin@143");
		System.out.println(g1.getUpi());
		System.out.println(g1.getPwd());

	}

}
