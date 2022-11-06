package LinkedList;
import java.util.LinkedHashSet;
import java.util.Iterator;
public class LinkedHashSetDemo {
public static void main(String[] args) {
  LinkedHashSet<String> s1=new LinkedHashSet<>();
  s1.add("Samsung");
  s1.add("Apple");
  s1.add("Xiaomi");
  s1.add("Vivo");
  s1.add("Oppo");
  s1.add(null);// only one null obj is allowed
  s1.add("Vivo");//duplicates are not allowed
  Iterator<String> i1=s1.iterator();
  while(i1.hasNext()) {
	  System.out.println(i1.next());//Op is insertion order
  }
	}

}
