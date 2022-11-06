package Arrays_Practise;
//WAP to print sum of Even num's from an array throgh cmd line args
public class Array_9_SumOfEvennums {

	public static void main(String[] a) {
      int sum=0;
      for(int i=0;i<a.length;i++)
      {
    	  if(Integer.parseInt(a[i])%2==0)
    	  sum=sum+Integer.parseInt(a[i]);
      }
      System.out.println("Sum of Even:"+sum);
	}

}
