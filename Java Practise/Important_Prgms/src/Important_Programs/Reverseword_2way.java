package Important_Programs;

public class Reverseword_2way {
	public static void main(String[] args) {
		String str[] = new String[]{"I","Love","India"};
//	String	arr[] = str.split(" ");
	System.out.print("Reverse of word is:");
	
	//for(int i=0;i<arr.length;i++) { //for actual word
		for (int i=str.length-1;i>=0;i--) {// to perform reverse word
		System.out.print(str[i]+" ");
	 }
	}
}
