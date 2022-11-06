package Collections.Progs;
//Eg for Hashset
import java.util.HashSet;
import java.util.Iterator;
public class HashsetDemo {
	public static void main(String[] args) {
   HashSet<String> s1=new HashSet<>();
   s1.add("Samsung");
   s1.add("Apple");
   s1.add("xaiomi");
   s1.add("Vivo");
   s1.add("Oppo");
   s1.add(null);//It allows null only one null obj
   s1.add("Vivo");
   
  Iterator<String> i1=s1.iterator();
  while(i1.hasNext())
	  System.out.println(i1.next());//Op: is random format
   
	}

}
