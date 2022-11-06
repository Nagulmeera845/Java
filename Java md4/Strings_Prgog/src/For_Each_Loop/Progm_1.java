package For_Each_Loop;

public class Progm_1 {

	public static void main(String[] args) {
    String s="Java development is tough";
    String str[]=s.split(" ");
    //@for each loop
    for(String d: str)
    {
    	System.out.println(d);
    }
	}

}
//length() Method->String -length of string
//length variable->arrays-length of array