
public class Print_Primenum_2_to_8 {

	public static void main(String[] args) {
		int sum =0,cp=0;
		for(int num =2;num<=8;num++)
		{
			int count=0;
			for(int i=1;i<=num;i++) {
				if(num%i==0)
					count++;
			}
			if(count==2)
				System.out.println(num+ " is a prime number ");
		}
			cp++;
			System.out.println(cp);
		
		
      
	}

}
