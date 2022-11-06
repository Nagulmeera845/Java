package PriorityQueue;
import java.util.PriorityQueue;
public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Object> p1=new PriorityQueue<>();
		p1.add("Dellotte");
		p1.add("Infosys");
		p1.add("Adp");
		p1.add("Virtusa");
		p1.add("Broadedge");
		p1.add("Infosys");
		while(p1.peek()!=null){
			System.out.println(p1.poll());
		}
		System.out.println(p1);
		//p1.add(null); we'll get null pointer exception
		//p1.add(50000); we'll get typecast exception
	}

}
