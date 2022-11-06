
public class Sumeven_productodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0,pdt=1;
for( int i=1;i<=25;i++)
{
	if(i%2==0)
		sum=sum+i;
	else
		pdt=pdt*i;
	
}
System.out.println(" sum of even upto 25 numbers : "+sum);
System.out.println(" sum of Product upto 25 numbers : "+pdt);
	}

}
