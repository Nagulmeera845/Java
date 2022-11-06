package LinkedList;
import java.util.HashSet;
import java.util.Iterator;
public class HashsetDemo {
	public static void main(String[] args) {
		//instance string using object
    HashSet<Object> s1=new HashSet<>();
    s1.add("Samsung");
    s1.add("Apple");
    s1.add("Xiaomi");
    s1.add("Vivo");
    s1.add("Oppo");
    s1.add(12345);
    s1.add(null); //only one null obj is allowed
    s1.add("Vivo");//duplicates are not allowed
    Iterator<Object> i1=s1.iterator();
    while(i1.hasNext()) {
    	System.out.println(i1.next());//Op is random order
    }
    
	}

}
