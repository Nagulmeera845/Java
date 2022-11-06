package Arrays_Practise;
//WAP to print sum of Odd num's from an array through cmd line args

public class Array_9_SumOfOddnums {
	public static void main(String[] a) {
     int sumodd=0;
     for(int i=0;i<a.length;i++)
     {
    	 if(Integer.parseInt(a[i])%2!=0)
    		 sumodd=sumodd+Integer.parseInt(a[i]);
     }
     System.out.println("Sum of odd:"+sumodd);
	}

}
