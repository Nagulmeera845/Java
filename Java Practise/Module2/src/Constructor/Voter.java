package Constructor;
public class Voter {
 String name;
 int vidnum;
  public Voter() { //default
	  name="Nagul";
	  vidnum=2651222;
  }
  Voter(String str,int n)//with args
  {
	  name=str;
	  vidnum=n;
  }
	public static void main(String[] args) {
     Voter v1=new Voter();//Default 
     Voter v2=new Voter("nasira",2651022);//parameterized with args
     System.out.println(v1.name);
     System.out.println(v1.vidnum);
     System.out.println(v2.name);
     System.out.println(v2.vidnum);
	}

}
