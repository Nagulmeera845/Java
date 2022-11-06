package Collections.Progs;
import java.util.ArrayList;
public class Second {
	public static void main(String[] args) {
 ArrayList a1=new ArrayList();
   a1.add("Java");
   a1.add(true);
   a1.add(66.786f);
   a1.add(9989078508L);
   System.out.println("Initial a1:"+a1);//[Java, true, 66.786, 9989078508]
   ArrayList a2=new ArrayList();
   a2.addAll(a1);
   System.out.println("copied a2:"+a2);//[Java, true, 66.786, 9989078508]
   a1.remove("Java");
   a1.remove(2);
   System.out.println("After removing a1:"+a1);//[true, 66.786]
   a1.set(1,"python");
   System.out.println("After replace a1:"+a1);//[true, python]
   System.out.println("***** Objects from a2 arraylist are *****");
   for(int i=0;i<a2.size();i++)
   {
	   System.out.println("object at index:"+i+":"+a2.get(i));
	  //object at index :0:Java
	  // object at index:1:true
	  // object at index:2:66.786
	  // object at index:3:9989078508
   }
   boolean b=a1.isEmpty();
   System.out.println("Checking empty:"+b);//false
   boolean b1=a1.contains("Java");
   System.out.println("checking particular object:"+b1);//false
	}
	
}
