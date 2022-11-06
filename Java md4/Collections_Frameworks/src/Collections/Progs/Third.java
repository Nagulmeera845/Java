package Collections.Progs;
import java.util.ArrayList;
//Generic Program:
//Syntax: classname<Genric> ref=new classname<>();
public class Third {

	public static void main(String[] args) {
    ArrayList<String> a1=new ArrayList<>();//can add only string objects
    a1.add("Java");
    ArrayList<Integer> a2=new ArrayList<>();//can add only integer objects
    a2.add(4747);
    ArrayList<Character> a3=new ArrayList<>();//can add only character objects
    a3.add('#');
    ArrayList<Object> a4=new ArrayList<>();//Any type of objects
    a4.add("Pyhton");// this is string
    a4.add(12345);// integer
    a4.add('N');//character
    a4.add(99.845F);//float
    a4.add(6300682178L);//Long
    a4.addAll(a1);// obj a4=new String();->upcasting
    a4.addAll(a2);// obj a4=new Integer();->upcasting
    a4.addAll(a3);// obj a4=new Character();->upcasting
    System.out.print(a4);
    
	}

}
