package Important_Programs;

public class ReverseSentence {

	public static void main(String[] args) {
    String str = "I Love Khammam City";
    String output = "";
    
    String arr[]= str.split(" ");
    for(int i= arr.length-1;i>=0;i--) {
    	output=output+arr[i]+" ";
    }
    	System.out.print(output);
   	}
  }
