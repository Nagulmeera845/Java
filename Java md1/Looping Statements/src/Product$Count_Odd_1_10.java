
public class Product$Count_Odd_1_10 {

	public static void main(String[] args) {

		int sum=0,product =1,count=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0) {                                    // if block {} complsory
			count++;
			sum=sum+i;
			product=product*i;
		}
			
		}
		System.out.println("COUNT IS : "+count);
		System.out.println("SUM IS : " +sum);
		System.out.println("PRODUCT IS : " +product);
	

	}
}
