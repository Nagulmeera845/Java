package Module1_Practice;

public class Armstrong_num {

	public static void main(String[] args) {
    int num=153,rem,arm=0,temp=num;
    while(num>0) {
    rem=num%10;
    num=num/10;
    arm=arm+rem*rem*rem;
    }
    if(temp==arm)
    	System.out.println(temp+" : Armstrong number");
    else
    	System.out.println(temp+" : Non-Armstrong number");
	}

}
