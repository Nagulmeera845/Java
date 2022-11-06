import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
      ArrayList<String> a1=new ArrayList<>();
      a1.add("Java");
      a1.add("Python");
      a1.add(null);
      a1.add("Sql");
      a1.add("DS");
      Iterator<String> i1=new a1.iterator();
      while(i1.hasNext()==true)
      {
    	  System.out.println(i1.next());
      }
	}

}
