package Constructor;
public class Student {
     String name;int rno;
    /* public Student() {  //defaut constructor
    	 name="Nagul";
    	 rno=118;
     }
     */
	public static void main(String[] args) {
     Student s1=new Student();
     System.out.println(s1.name);
     System.out.println(s1.rno);
	}

}
