import java.util.HashMap;
public class HashMapDemo {
public static void main(String[] args) {
HashMap<Integer,String> m1=new HashMap<>();
///put(key,value)
m1.put(10001,"India");
m1.put(566432,"Canada");
m1.put(7865,"Pakistan");
m1.put(20001,"USA");
System.out.println(m1);
m1.put(7865,"Netherland");//duplicate
System.out.println(m1);
m1.put(45001,"India");
System.out.println(m1);
//Op is random order based on hashcode
	}

}
