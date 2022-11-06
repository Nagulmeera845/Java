package LinkedList;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetDemo {
	public static void main(String[] args) {
  TreeSet<Object> s1=new TreeSet<>();
  s1.add("Samsung");
  s1.add("Apple");
  s1.add("Xiaomi");
  s1.add("Vivo");
  s1.add("Oppo");
  s1.add("Vivo");
  //s1.add(null); class cast exception
  //s1.add(50000); nullpointer exception
  Iterator<Object> i1=s1.iterator();
  while(i1.hasNext()) {
	  System.out.println(i1.next());//Op is sorted order
  }
  
	}

}
