package Arrays_Practise;
//WAP to create an array print sub,sum & avg of an array by taking ip from-
//-cmd line args

public class Array_8Subrctn_Cmdlneargs {
  //WAP to Subtraction,Sum,Avg of an array through cmdlineargs 
	public static void main(String[] a) {
     int sub=0,sum=0;
     for(int i=0;i<a.length;i++) {
    	 sub=sub-Integer.parseInt(a[i]);//to convert string into integer
    	 sum=sum+Integer.parseInt(a[i]);
     }
     System.out.println("Subtraction :"+sub);
     System.out.println("Sum is:"+sum);
     float avg=sum/a.length;
     System.out.println("Average:"+avg);
	}

}
