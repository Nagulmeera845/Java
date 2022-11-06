import java.util.LinkedHashMap;
public class LinkedHashMapDemo {
public static void main(String[] args) {
 LinkedHashMap<Object,String>m1=new LinkedHashMap<>();
 m1.put(10001,"India");
 m1.put(566432,"Canada");
 m1.put(7865,"Pakistan");
 m1.put(20001,"USA");
 m1.put('$', "Afganistan");
 System.out.println(m1);//Op is insertion order
 

		
	}

}
