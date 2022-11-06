package Objectclass;

class MyThread extends Thread{
	public void run() {
		//Thread
		for(int i=1;i<=5;i++)
			System.out.println("My Thread");
	}
}
public class User {

	public static void main(String[] args) {
    MyThread t1=new MyThread();
    t1.start();
    for(int i=1;i<=5;i++)
    	System.out.println("Main Method");
	}

}
