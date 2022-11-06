package Collections.Progs;
import java.util.ArrayList;
import java.util.ListIterator;

public class Prog_8 {

	public static void main(String[] args) {
    ArrayList<String> a1=new ArrayList<>();
    a1.add("Java");
    a1.add("Python");
    a1.add(null);
    a1.add("Sql");
    a1.add("DS");
    //@cursors->ListIterator
    ListIterator<String> i1=a1.listIterator();//cursor ready
    System.out.println("Forward direction:");
        while(i1.hasNext()==true) { //return true if obj avl
    	System.out.println(i1.next()); //return obj and points cursor-
    	                           //      -to next object
    }
    
    System.out.println("Reverse direction:");
        while(i1.hasPrevious()==true) //returns true if obj is avl to-
        	                       //   -iterate from previous
    {
    	System.out.println(i1.previous());// return to current obj& move-
    	                          //-cursor to next obj in previous directn
    }	
	}
}
