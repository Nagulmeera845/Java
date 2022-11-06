package Arrays_Practise;

public class Array_20 {

	public static void main(String[] args) {  //0,.......8
    int a[]= {1,2,3,3,6,9,4,5,5}; //take random array
    int temp;
    for(int i=0;i<a.length;i++)// first sorting the array,0<9
	{
		for(int j=0;j<a.length-1;j++)//0<8
//new array will be:{1,2,3,3,4,5,5,6,9}
			         
		{
			if(a[j]>a[j+1])//0>1
			{  //swapping
			temp=a[j];
		    a[j]=a[j+1];
			a[j+1]=temp;
		}
	}
}
int b[]=new int [a.length];//take random array with same size of original array
int k=0;//extra var store non duplicate value in index manner
for(int i=0;i<a.length-1;i++)//sorting logic
	
	{ //a.length-1=>9-1=8,0<8 i.e,7
	//a.length-1 means refer to next index value
	if(a[i]!=a[i+1]) //1!=1-F,1!=2-T,1!=3-T
//from 0 till last index compare each values if values are not same
//move it in another array	
	{
		b[k]=a[i];//store last value manually in array,k=0,k=1
		k++;// for updation to 1
	}
}
//printing new array without duplicates
b[k]=a[a.length-1];
System.out.println("New array without duplicates:");
for(int i=0;i<=k;i++)
{
	System.out.println(b[i]);

  
	}

}}
