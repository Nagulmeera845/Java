package Collections.Progs;
import java.util.ArrayList; //import statemnt
public class First
{
  public static void main(String[] args) 
	{
     ArrayList a1=new ArrayList(); //creation of ArrayList object
     //initially by default capacity 10 objects created
     //if we want morethan 10 or 11th obj the size of arraylist will be-
     //-increased by current capacity*3/2+1
     
     //a1->var ,add->method, java->object
     a1.add("Java");
     a1.add(true);
     a1.add(500000);
     a1.add(9515627845L);
     a1.add(192.845F);
     a1.add("@");  //It allows heterogeneous data and homo
     a1.add(null);    //It allows null objects
     a1.add("Java"); //It allows duplicate values
     //tostring(),forloop,for each loop,cursors.
     System.out.println(a1.toString()); //a1
     a1.add("python");
     a1.add(new Student ("jani",7641));
     a1.add(new Employee("Nagul",4747));
     System.out.println(a1);//Bydefault it will consider a1.toString()
	}
		
	}


