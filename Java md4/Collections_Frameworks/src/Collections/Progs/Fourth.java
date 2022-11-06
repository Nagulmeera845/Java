package Collections.Progs;
import java.util.ArrayList;
import java.util.Collections;
public class Fourth {

	public static void main(String[] args) {
      ArrayList <String> a1=new ArrayList<>();//can add only string objects
      a1.add("Java");
      a1.add("Python");
      a1.add("Data structure");
      a1.add("C++");
      a1.add("Angular JS");
      a1.add("Spring Boot");
      //for each loop
      //syntax: for(Generic var:ref)
      for(String data:a1) {
    	  System.out.println(data);
      }
      Collections.sort(a1);
      System.out.println("Sorted ascending:"+a1);//[Angular JS, C++, Data structure, Java, Python, Spring Boot]
      Collections.reverse(a1);
      System.out.println("Sorted Decending:"+a1);//Spring Boot, Python, Java, Data structure, C++, Angular JS]
	}

}
