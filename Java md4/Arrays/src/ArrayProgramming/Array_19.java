package ArrayProgramming;
//Wap to print sum,avg and count of all prime num from an array
public class Array_19 {

	public static void main(String[] args) {
       int a[]=new int[] {11,122,13,14,15};
       int sum=0,count_p=0;
       for(int i=0;i<a.length;i++) //0-index till 4 index
       {
    	   int count=0;//for each number divsion count should start with zero
    	   for(int j=1;j<=a[i];j++) //1-11,11<11
    	   {
    		   if(a[i]%j==0) //11%1,11%2,11%3.......11%11
    		   {
    			   count++;// count=1
    		   }
    	   }
    	   if(count==2)
    	   {
    		   sum=sum+a[i]; //0+11+13
    		   count_p++;  //2
    	   }
       }
       float avg=sum/count_p; //24/2
       System.out.println("Sum of prime numbers : "+sum); // 24
       System.out.println("Avg of prime numbers :"+avg);   //12
       System.out.println("Count of prime numbers :"+count_p);  //2
	}

}
