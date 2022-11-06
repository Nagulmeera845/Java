
public class Count_primenums_22_to_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int cp=0;
 for(int i=22;i<=90;i++)
 { 
	 int count=0;
	 for(int j=1;j<=i;j++)
	 {
		 if(i%j==0)
		 {
			 count++;
		 }
	 }
	 if(count==2)
		 cp++;
		 System.out.println(i+ " is a prime number");
 }
 
 System.out.println("\n total prime numbers are : "+cp);
	}
	
}
