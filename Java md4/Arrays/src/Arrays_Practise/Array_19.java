package Arrays_Practise;
//WAP to print Sum,avg & count of all primenumbers from an array
public class Array_19 {

	public static void main(String[] args) {
     int a[]=new int[] {11,143,341,69,47,59};//create an array
     int sum=0,count_p=0;
     int l=a.length;  //a.length=>toatal array length
     for(int i=0;i<a.length;i++)  //logic for execute array size execution
     {
    	 int count=0;//extra var for count
    	    //
      	   for(int j=1;j<=a[i];j++) //1-11,11<11 ,logic for prime num
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
    float avg=sum/count_p;
    System.out.println("Sum :"+sum);
    System.out.println("Avg :"+avg);
    System.out.println("Count :"+count_p);
    System.out.println("length of array is:"+l);
	}

}
