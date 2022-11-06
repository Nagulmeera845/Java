package Collections.Progs;
//Eg: for Treeset
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetDemo {
	public static void main(String[] args) {
   TreeSet<Object> s1=new TreeSet<>();
   s1.add("Samsung");
   s1.add("Apple");
   s1.add("xaiomi");
   s1.add("Vivo");
   s1.add("Oppo");
 //s1.add(50000);classcast exception occurs
  //Hetero obj's are not allowed
  // s1.add("Vivo");Duplicates are not allowed
   
   Iterator<Object> i1=s1.iterator(); 
    while(i1.hasNext())
   	System.out.println(i1.next());//Op:is in sorted order
	}

}
