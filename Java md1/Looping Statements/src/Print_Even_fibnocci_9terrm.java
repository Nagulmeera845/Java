
public class Print_Even_fibnocci_9terrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a=0,b=1,c;
  System.out.println(a+ "  " +b+ "  ");
  for(int i=1;i<=9;i++)
  {
	  c=a+b;
	  a=b;
	  b=c;
	  if(c%2==0)
		  System.out.println(c+ "  ");
  }
	}

}
