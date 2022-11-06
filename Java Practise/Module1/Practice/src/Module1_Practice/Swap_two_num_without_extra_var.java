package Module1_Practice;

public class Swap_two_num_without_extra_var {

	public static void main(String[] args) {
    int a=10,b=20;
    System.out.println("Before swap: "+a+" "+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("After swap: "+a+" "+ b);
	}

}
