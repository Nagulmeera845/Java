package Arrays_Practise;
//WAP to create an array of int type add 5 size 
public class Arrays_1 {

	public static void main(String[] args) {
		 int a[]=new int [5];//Array creation with size
	      a[0]=95; a[1]=15; a[2]=62; a[3]=78;//Array initialisation
	      a[4]=45;
	      int l=a.length;// for finding of length of array
	      
	      //@printing
	      System.out.println(a[0]+""+a[1]+""+a[2]+""+a[3]+""+a[4]);
	      System.out.println("length:"+l);
	}

}
