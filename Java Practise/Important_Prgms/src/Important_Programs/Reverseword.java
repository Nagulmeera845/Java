package Important_Programs;

public class Reverseword {

	public static void main(String[] args) {
		String Str = "I Love India";
		String	arr[] = Str.split(" ");
		System.out.print("Reverse of word is:");
		
		//for(int i=0;i<arr.length;i++) { //for actual word
			for (int i=arr.length-1;i>=0;i--) {// to perform reverse word
			System.out.print(arr[i]+" ");
     }
	}
  }
