package Encapsulation;
class Gmail{
	private String uname,pwd;
	// setter for uname
	public void setUname(String uname) {
		this.uname=uname;
	}
	public void setPwd(String pwd) {
		this.pwd=pwd;
	}
	// getter for uname
	public String getUname() {
		// validate
		if(uname=="nagulmeera845@gmail.com") {
			return  "valid gamil address";
		}
		else {
			return "Invalid gmail,please enter correct address";
		}
		
	}
	// getter dor pwd
	public String getPwd(){
		if(pwd=="Nagul@143") {
			return "valid passwaord";
		}
		else {
			return "invalid passwaord ,enter correct password";
		}
	}
}

public class GmailUser {

	public static void main(String[] args) {
		Gmail g1=new Gmail();
		g1.setUname("nagulmeera845@gmail.com");
		g1.setPwd("Nagul@341");
		
		System.out.println(g1.getUname());
		System.out.println(g1.getPwd());
		

	}

}
