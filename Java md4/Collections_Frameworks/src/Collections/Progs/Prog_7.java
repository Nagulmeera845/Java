package Collections.Progs;
import java.util.ArrayList;
import java.util.Iterator;
public class Prog_7 {

	public static void main(String[] args) {
 ArrayList<String> a1=new ArrayList<>();
 a1.add("Java");
 a1.add("Python");
 a1.add(null);
 a1.add("Sql");
 a1.add("Ds");
 Iterator<String>i1=a1.iterator();//cursor ready
 while(i1.hasNext()==true) 
 {                        //return true if object available
	 System.out.println(i1.next());//return object and points cursor- 
	                               //-to next oject
 
	}
	}
}
