package Strings_Progms;
//String:String is a pre define class it consist some pre-define methods 
// which is comes under java.lang package
public class StringDemo {

	public static void main(String[] args) {
     String str=new String("Nagulmeera");
     System.out.println("String Name:"+str);
     System.out.println("Length of String:"+str.length());//10
     System.out.println("Index of char l is:"+str.indexOf("l"));//start from 0
     System.out.println("Character at 8th position is:"+str.charAt(8));//
     System.out.println("Uppercase method is:"+str.toUpperCase());
     System.out.println(str);//here eventhough we are apply uppercase -
// -we are not assign to any other string so just it is a static
// it will not be change from main location
// so this is main disadvantage of string
// most memory is required
     System.out.println("Lowercase method is:"+str.toLowerCase());
     System.out.println(str.compareTo("Nagulmeera"));//every char is equal
     System.out.println(str.trim());//for remove white spaces
     str.concat("Good boy");//modification is not done,so assign to its obj or other
     str=str.concat(" is innocent");//here modification is done 
     // user wants modification that many times obj's should be created, data stored 
     // in heap area so, string class requires more memory area
     System.out.println(str);
     System.out.println(str.replace("Nagulmeera","Yakubpasha"));
	}

	private static int length() {
		// TODO Auto-generated method stub
		return 0;
	}
	}


	



	
	


