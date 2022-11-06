package ArrayProgramming;
//Sum of Even numbers from an array take ip from commandline args
public class Array_9 {

	public static void main(String args[]) {
   int sum=0;
   for(int i=0;i<args.length;i++)
   {
	   if(Integer.parseInt(args[i])%2==0)
		   sum=sum+Integer.parseInt(args[i]);
   }
   System.out.println("Sum of even: "+sum);
	}

}
