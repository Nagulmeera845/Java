package Objectclass;

public class Student {
	
      String name;
      int id;
      Student (String name, int id){
    	  this.name=name;
    	  this.id=id;
      }
      //@Overriding tostring
      public String tostring() {
    	  return name;
      }
      //@Overriding hashcode
      public int hashcode() {
    	  return id;
      }
      public static void main(String args[]) {
    	  Student s1=new Student("Nagul",9786);
    	  String a=s1.tostring();
    	  System.out.println(a);
    	  
    	  int b=s1.hashcode();
    	  System.out.println(b);
      }
	}


