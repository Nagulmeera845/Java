package Arrays_Practise;
//WAP Sum & Avg of an array by taking an array through CmdLineArgs
public class Array_8SumAvg_Cmdlneargs {
                            
	public static void main(String[] args) {
		                   //(Arraytype [] args/input)
     int sum=0;  //Extra var for sum
     for(int i=0;i<args.length;i++) //
     {
    	 sum=sum+Integer.parseInt(args[i]);//to convert string into integer cmd line args
     }
     System.out.println("Sum is: "+sum); 
     float avg=sum/args.length;
     System.out.println("Average:"+avg);
	}

}
