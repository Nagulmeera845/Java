package For_Each_Loop;
// 9) WAP to print longest word from a string
// IP: we love our  college days
// OP: college
public class Progm_3 {

	public static void main(String[] args) {
    String s="we love our  college days";
    String str[]=s.split(" "); //("we","love","our","college","days")
    String max=str[0]; //college
    for(int i=1;i<str.length;i++) //5<5
    {
	  if(str[i].length()>max.length()) //days.length()> college.length() ->4>7
		{
			max=str[i];
    	}
	}
    System.out.println("Longest word is: "+max);
      }
	}
