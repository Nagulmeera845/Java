package For_Each_Loop;

public class Progm_7 {

	public static void main(String[] args) {
  String s="java development is easy"; //OP:jav delopmntisy
  String un="";
  for(int i=0;i<s.length();i++) //15<23
  {
	  char ch=s.charAt(i);
	  if(un.indexOf(ch)==-1) //indexOf('y')
	  {
		  un=un+ch; // jav delopmntisy
	  }
  }
  System.out.println("String without duplicate is:"+un);
	}

}
