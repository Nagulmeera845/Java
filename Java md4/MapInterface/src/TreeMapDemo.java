import java.util.TreeMap;
public class TreeMapDemo {
	public static void main(String[] args) {
    TreeMap<Object,String> m1=new TreeMap<>();
    
    m1.put(1000,"India");
    m1.put(788,"Canada");
    m1.put(1200,"Pakistan");
    m1.put(800,"USA");
    m1.put(1100,"Afganistan");
    //m1.put(null,"@@@@");//null pointer exception
   // m1.put('A',"$$$$");//class cast exception
    System.out.println(m1);//Op is sorting order based keys
    
    

}}
